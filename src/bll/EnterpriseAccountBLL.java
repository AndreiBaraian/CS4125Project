package bll;

import account.EnterpriseAccount;
import dao.EnterpriseAccountDAO;

public class EnterpriseAccountBLL extends AccountBLL<EnterpriseAccount>{

	public EnterpriseAccountBLL() {
		super(new EnterpriseAccountDAO());
	}

}
