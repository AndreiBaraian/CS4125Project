package bll;

/**
 * @author Andrei Baraian
 */

import account.EnterpriseAccount;
import dao.EnterpriseAccountDAO;

public class EnterpriseAccountBLL extends AccountBLL<EnterpriseAccount> {
	
	public EnterpriseAccountBLL(){
		super(new EnterpriseAccountDAO());
	}

}
