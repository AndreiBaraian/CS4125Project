package control;

import account.Account;
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
			FamilyAccount account = (FamilyAccount)accountBLL.getAccount(id);
			account.setNumbersString(numbers);
			accountBLL.modifyAccount(account);
		}
}
