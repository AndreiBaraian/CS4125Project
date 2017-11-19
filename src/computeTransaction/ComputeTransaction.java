package computeTransaction;

import java.util.ArrayList;
import java.util.List;

import account.Account;
import bll.AccountBLL;
import bll.RegionBLL;
import control.Control;
import service.Service;

public class ComputeTransaction {

	//----------------------------------------------------------have the take the services from the data base and process all of them one by one
	private AccountBLL<?> accountBLL;
	private RegionBLL regionBLL;
	private Control control=Control.getInstance();
	
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
		List<Service> services= new ArrayList<Service>();
		
	}
}
