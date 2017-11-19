package computeTransaction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import account.Account;
import bll.AccountBLL;
import bll.RegionBLL;
import control.Control;
import region.Region;
import service.Service;
import service.ServiceFactory;

public class ComputeTransaction {

	//----------------------------------------------------------have the take the services from the data base and process all of them one by one
	private AccountBLL<?> accountBLL;
	private Control control=Control.getInstance();
	private static final String FILENAME = "generatedServices.csv";
	private RegionBLL regionBLL;
	
	public ComputeTransaction(){
		accountBLL = new AccountBLL();
		regionBLL = new RegionBLL();
	}
	
	public Service computeBill(Service service){
		double roamingTax = 0.0;
		boolean international ;
		String number= service.getNumber();
		Account account = accountBLL.getAccountByNumber(number);
		if(account.getHomeregion().getRegionName().equalsIgnoreCase(service.getLocationFromString())){		
			roamingTax= account.getHomeregion().getRoamingTax();
		}		
	
		international = service.applyPrice(roamingTax);
		updateAccount(account,service);
		return service;
	}
	
	public void updateAccount(Account account, Service service){
		
	}
	
	public void processServices(){
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
			String line;
			String csvSplitBy = ",";
			while((line = br.readLine()) != null){
				String[] serviceArg = line.split(csvSplitBy);
				Service service = ServiceFactory.getService(serviceArg[0], regionBLL.search(serviceArg[1]), serviceArg[2], regionBLL.search(serviceArg[4]), Integer.parseInt(serviceArg[5]));
				System.out.println(service.toString());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
