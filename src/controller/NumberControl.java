package controller;
/*
 * @author Xiangkai Tang
 */

import account.FamilyAccount;
import account.EnterpriseAccount;
import bll.AccountBLL;

public class NumberControl {

		AccountBLL<?> accountBLL;
		private String id;
		private String numbers;
		
		public NumberControl(String id, String numbers) {
			super();
			this.accountBLL = new AccountBLL();
			this.id = id;
			this.numbers = numbers;
		}
		
		public void addNumber(){   
			if(accountBLL.getAccount(id).getClass().getSimpleName().trim()=="EnterpriseAccount")
			{
				EnterpriseAccount account = (EnterpriseAccount)accountBLL.getAccount(id);
				account.setNumber(account.getNumber());
				accountBLL.modifyAccount(account);
			}
			else
			{
			FamilyAccount account = (FamilyAccount)accountBLL.getAccount(id);
			account.setNumbersString(account.getNumbersString()+"  "+numbers);
			accountBLL.modifyAccount(account);
			}
		}
		
		
}
