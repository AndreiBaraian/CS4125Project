package dao;

/**
 * @author Andrei Baraian
 */

import account.EnterpriseAccount;

public class EnterpriseAccountDAO extends AccountDAO<EnterpriseAccount> {
	
	public EnterpriseAccountDAO(){
		this.uniqueIdentifierFieldName = "customerSystemReference";
	}

}
