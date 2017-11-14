package insertions;

import account.EnterpriseAccount;
import bll.AccountBLL;
import bll.CustomerBLL;
import bll.EnterpriseAccountBLL;
import customer.Customer;
import exceptions.InsertException;
import region.Region;
import region.Romania;

public class DataInsert {
	
	private CustomerBLL customerBLL;
	private AccountBLL<EnterpriseAccount> enterpriseBLL;
	
	public DataInsert(){
		this.customerBLL = new CustomerBLL();
		enterpriseBLL = new EnterpriseAccountBLL();
	}
	
	public void insertCustomersAndAccounts() throws InsertException{
		Region romania = new Romania();
		Customer customer1 = customerBLL.add("Andrei", "Baraian", 20, "Bihorului 14", "andrei@gmail.com");
		enterpriseBLL.addAccount("Enterprise", romania, customer1, "0727455675", "12/11/2017");
	}

}
