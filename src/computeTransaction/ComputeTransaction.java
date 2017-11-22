package computeTransaction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import account.Account;
import bll.AccountBLL;
import bll.CallBLL;
import bll.InternetUsageBLL;
import bll.MessageBLL;
import bll.RegionBLL;
import bll.ServiceBLL;
import control.Control;
import exceptions.InsertException;
import region.Region;
import service.Service;
import service.ServiceFactory;

public class ComputeTransaction {

	//----------------------------------------------------------have the take the services from the data base and process all of them one by one
	private AccountBLL<?> accountBLL;
	private Control control=Control.getInstance();
	private static final String FILENAME = "generatedServices.csv";
	private RegionBLL regionBLL;
	private MessageBLL messageBLL;
	private CallBLL callBLL;
	private InternetUsageBLL internetUsageBLL;
	private double fullBill;
	private double customersBill;

	
	
	public ComputeTransaction(){
		accountBLL = new AccountBLL();
		regionBLL = new RegionBLL();
		messageBLL = new MessageBLL();
		callBLL = new CallBLL();
		internetUsageBLL = new InternetUsageBLL();
		fullBill = 0.0;
		customersBill = 0.0;
	}
	
	public Service computeBill(Service service){
		double roamingTax = 0.0;
		Account account;
		Account updatedAccount;
		Region region;
		String number= service.getNumber();
		account = accountBLL.getAccountByNumber(number);
		region = regionBLL.search(account.getHomeRegionString());
		System.out.println(account.getHomeRegionString());
		System.out.println(service.getLocationFromString());
		if(account.getHomeRegionString().equalsIgnoreCase(service.getLocationFromString())){		
			roamingTax = region.getRoamingTax();
			service.setInternational(true);
		}		
		service.applyPrice(roamingTax);	
		UpdateAccountContext updateAccountContext = new UpdateAccountContext(new CreatedAccount(), account,service, roamingTax);
		updatedAccount = updateAccountContext.updateAccount();
		accountBLL.modifyAccount(updatedAccount);
		fullBill = fullBill+service.getCost();
		customersBill = customersBill+service.getCustomerCost();
		return service;
		
	}

	
	public void processServices() throws InsertException{
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
			String line;
			String csvSplitBy = ",";
			while((line = br.readLine()) != null){
				String[] serviceArg = line.split(csvSplitBy);
				Service service = ServiceFactory.getService(serviceArg[0], regionBLL.search(serviceArg[1]), serviceArg[2], regionBLL.search(serviceArg[4]), Integer.parseInt(serviceArg[5]));
				System.out.println(service.toString());
				Service updatedService = computeBill(service);
				
				getBLL(service.getClass().getName()).addService(updatedService);
			}
			System.out.println("Finished");
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(fullBill);
	}
	
	private ServiceBLL<?> getBLL(String type){
		ServiceBLL<?> serviceBLL = null;
		if(type.equals("Message"))
			serviceBLL = messageBLL;
		else if(type.equals("Call"))
			serviceBLL = callBLL;
		else
			serviceBLL = internetUsageBLL;
		return serviceBLL;
	}
}
