package dao;

import account.FamilyAccount;

public class FamilyAccountDAO extends AbstractDAO<FamilyAccount> {
	
	public FamilyAccountDAO(){
		this.uniqueIdentifierFieldName = "customerSystemReference";
	}


}
