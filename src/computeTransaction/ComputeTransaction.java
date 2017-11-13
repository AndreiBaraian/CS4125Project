package computeTransaction;

import java.util.ArrayList;
import java.util.List;

import account.Account;
import control.Control;
import service.Service;

public class ComputeTransaction {

	//----------------------------------------------------------have the take the services from the data base and process all of them one by one
	
	private Control control=Control.getInstance();
	
	public void computeBill(Service s){
		String number= s.getNumber();
		//---------------------------------------------------------- find the account based on number
		Account userAccount = null;
		double roamingTax= userAccount.getHomeregion().getRoamingTax();
		s.applyPrice(roamingTax);
		
	}
	
	public void processServices(){
		List<Service> services= new ArrayList<Service>();
		
	}
}
