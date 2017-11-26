package insertions;

/**
 * @author Andrei Baraian
 */

import account.EnterpriseAccount;
import bll.AccountBLL;
import bll.CustomerBLL;
import bll.EnterpriseAccountBLL;
import bll.RegionBLL;
import customer.Customer;
import exceptions.InsertException;
import region.China;
import region.Ireland;
import region.Region;
import region.Romania;

public class DataInsert {
	
	private CustomerBLL customerBLL;
	private AccountBLL<EnterpriseAccount> enterpriseBLL;
	private RegionBLL regionBLL;
	
	public DataInsert(){
		this.customerBLL = new CustomerBLL();
		enterpriseBLL = new EnterpriseAccountBLL();
		regionBLL = new RegionBLL();
	}
	
	public void insertCustomersAndAccounts() throws InsertException{
		Region romania = new Romania();
		Customer customer1 = customerBLL.add("Andrei", "Baraian", 20, "Bihorului 14", "andrei@gmail.com");
		enterpriseBLL.addAccount("Enterprise", romania, customer1, "0727455675", "12/11/2017");
	}
	
	public void insertRegions() throws InsertException{  // initial prices and some regions
		Region china = new China(10,8,8,6);  
		Region romania = new Romania(10,8,8,3);
		Region ireland = new Ireland(10,8,8,5);
		regionBLL.add(romania);
		regionBLL.add(china);
		regionBLL.add(ireland);
	}

}