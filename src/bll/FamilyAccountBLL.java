package bll;

import account.FamilyAccount;
import dao.FamilyAccountDAO;

public class FamilyAccountBLL extends AccountBLL<FamilyAccount> {
	
	public FamilyAccountBLL(){
		super(new FamilyAccountDAO());
	}

}
