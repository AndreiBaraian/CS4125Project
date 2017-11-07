package dao;

/**
 * @author Andrei Baraian
 */

import account.EnterpriseAccount;

public class EnterpriseAccountDAO extends AbstractDAO<EnterpriseAccount>{
	
	public EnterpriseAccountDAO(){
		this.uniqueIdentifierFieldName = "customerSystemReference";
	}

}
