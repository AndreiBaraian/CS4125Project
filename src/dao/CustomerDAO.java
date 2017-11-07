package dao;

/**
 * @author Andrei Baraian
 */

import customer.Customer;

public class CustomerDAO extends AbstractDAO<Customer>{
	
	public CustomerDAO(){
		this.uniqueIdentifierFieldName = "systemReference";
	}

}
