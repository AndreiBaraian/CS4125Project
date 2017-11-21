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
	
	
	public ComputeTransaction(){
		accountBLL = new AccountBLL();
		regionBLL = new RegionBLL();
		messageBLL = new MessageBLL();
		callBLL = new CallBLL();
		internetUsageBLL = new InternetUsageBLL();
	}
	
	public Service computeBill(Service service){
		double roamingTax = 0.0;
		Account account;
		Account updatedAccount;
		String number= service.getNumber();
		account = accountBLL.getAccountByNumber(number);
		if(account.getHomeregion().getRegionName().equalsIgnoreCase(service.getLocationFromString())){		
			roamingTax= account.getHomeregion().getRoamingTax();
			service.setInternational(true);
		}		
		service.applyPrice(roamingTax);	
		UpdateAccountContext updateAccountContext = new UpdateAccountContext(new CreatedAccount(), account,service, roamingTax);
		updatedAccount = updateAccountContext.updateAccount();
		accountBLL.modifyAccount(updatedAccount);
		return service;
	}
	
	public void updateAccount(Account account, Service service){
		
	}
	
	public void processServices() throws InsertException{
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
			String line;
			String csvSplitBy = ",";
			while((line = br.readLine()) != null){
				String[] serviceArg = line.split(csvSplitBy);
				Service service = ServiceFactory.getService(serviceArg[0], regionBLL.search(serviceArg[1]), serviceArg[2], regionBLL.search(serviceArg[4]), Integer.parseInt(serviceArg[5]));
				System.out.println(service.toString());
				//Service updatedService = computeBill(service);
				
				getBLL(service.getClass().getName()).addService(service);
			}
			System.out.println("Finished");
		}catch(IOException e){
			e.printStackTrace();
		}
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
