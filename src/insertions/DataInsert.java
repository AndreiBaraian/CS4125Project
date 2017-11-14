package insertions;

import bll.CustomerBLL;
import bll.EnterpriseAccountBLL;
import exceptions.InsertException;
import region.Region;
import region.Romania;

public class DataInsert {
	
	private CustomerBLL customerBLL;
	private EnterpriseAccountBLL enterpriseAccountBLL;
	
	public DataInsert(){
		this.customerBLL = new CustomerBLL();
	}
	
	public void insertCustomersAndAccounts() throws InsertException{
		Region romania = new Romania();
		customerBLL.add("Andrei", "Baraian", 20, "Bihorului 14", "andrei@gmail.com");
		
	}

}
