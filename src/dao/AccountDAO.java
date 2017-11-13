package dao;

/**
 * @author Andrei Baraian
 */

import account.Account;

public class AccountDAO<T extends Account> extends AbstractDAO<T>{
	
	public AccountDAO(){
		this.uniqueIdentifierFieldName = "customerSystemReference";
	}

}
