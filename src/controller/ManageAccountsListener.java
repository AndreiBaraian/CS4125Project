package controller;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import account.Account;
import account.EnterpriseAccount;
import account.FamilyAccount;
import bll.EnterpriseAccountBLL;
import bll.FamilyAccountBLL;
import view.ManageAccounts;

public class ManageAccountsListener implements ActionListener{

	private ManageAccounts manageAccounts;
	private FamilyAccountBLL familyAccountBLL;
	private EnterpriseAccountBLL enterpriseAccountBLL;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		List<FamilyAccount> familyAccounts;
		List<EnterpriseAccount> enterpriseAccounts;
		List<Account> allAccounts = new ArrayList<Account>();
		familyAccountBLL = new FamilyAccountBLL();
		enterpriseAccountBLL = new EnterpriseAccountBLL();
		enterpriseAccounts = enterpriseAccountBLL.getAll();
		familyAccounts = familyAccountBLL.getAll();
		allAccounts.addAll(enterpriseAccounts);
		allAccounts.addAll(familyAccounts);
		manageAccounts = new ManageAccounts(allAccounts);
		manageAccounts.setVisible(true);	
	}	
}
