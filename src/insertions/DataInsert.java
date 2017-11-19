package insertions;

import account.EnterpriseAccount;
import bll.AccountBLL;
import bll.CustomerBLL;
import bll.EnterpriseAccountBLL;
import bll.RegionBLL;
import customer.Customer;
import exceptions.InsertException;
import region.China;
import region.Region;
import region.Romania;

public class DataInsert {
	
	private CustomerBLL customerBLL;
	private AccountBLL<EnterpriseAccount> enterpriseBLL;
	RegionBLL regionBLL;
	
	public DataInsert(){
		this.customerBLL = new CustomerBLL();
		enterpriseBLL = new EnterpriseAccountBLL();
		regionBLL = new RegionBLL();
	}
	
	public void insertCustomersAndAccounts() throws InsertException{
		Region romania = new Romania();
		RegionBLL rb = new RegionBLL();
		//rb.add(romania);
		Customer customer1 = customerBLL.add("Andrei", "Baraian", 20, "Bihorului 14", "andrei@gmail.com");
		enterpriseBLL.addAccount("Enterprise", romania, customer1, "0727455675", "12/11/2017");
	}
	
	public void insertRegions() throws InsertException{
		//Region romania = new Romania(3,4);
		//regionBLL.add(romania);
		Region china = new China(4,5);
		regionBLL.add(china);
	}

}
