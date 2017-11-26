package computeTransaction;
/**
 * @author Lucian Epure 50%
 * @author Andrei Baraian 50% (processServices)
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import account.Account;
import bll.AccountBLL;
import bll.CallBLL;
import bll.InternetUsageBLL;
import bll.MessageBLL;
import bll.RegionBLL;
import bll.ServiceBLL;
import exceptions.InsertException;
import region.Region;
import service.Service;
import service.ServiceFactory;

public class ComputeTransaction {

	//----------------------------------------------------------have the take the services from the data base and process all of them one by one
	private AccountBLL<?> accountBLL;
	private static final String FILENAME = "generatedServices.csv";
	private RegionBLL regionBLL;
	private MessageBLL messageBLL;
	private CallBLL callBLL;
	private InternetUsageBLL internetUsageBLL;
	private double fullBill;
	private double customersBill;
	
	@SuppressWarnings("rawtypes")
	public ComputeTransaction(){
		this.accountBLL = new AccountBLL();
		this.regionBLL = new RegionBLL();
		this.messageBLL = new MessageBLL();
		this.callBLL = new CallBLL();
		this.internetUsageBLL = new InternetUsageBLL();
		this.fullBill = 0.0;
		this.customersBill = 0.0;
	}
	
	public Service computeBill(Service service){
		double roamingTax = 0.0;
		Account account;
		Account updatedAccount;
		Region region;
		String number= service.getNumber();
		account = accountBLL.getAccountByNumber(number);
		account.addObserver(account.getCustomer());
		region = regionBLL.search(account.getHomeRegionString());
		if(!account.getHomeRegionString().equalsIgnoreCase(service.getLocationFromString())){		
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
		Object message = new Object();
		message = "The total value of the bill is: " + this.fullBill;
		JOptionPane pane = new JOptionPane(message,JOptionPane.INFORMATION_MESSAGE);
		JDialog dialog = pane.createDialog(null, "TOTAL");
        dialog.setModal(false);
        dialog.setVisible(true);
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
