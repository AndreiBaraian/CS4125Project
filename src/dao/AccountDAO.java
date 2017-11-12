package dao;

import account.Account;

public class AccountDAO<T extends Account> extends AbstractDAO<T>{
	
	public AccountDAO(){
		this.uniqueIdentifierFieldName = "customerSystemReference";
	}

}
