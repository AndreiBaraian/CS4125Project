package bll;

import account.Account;
import account.AccountFactory;
import account.EnterpriseAccount;
import account.FamilyAccount;
import customer.Customer;
import dao.AbstractDAO;
import dao.EnterpriseAccountDAO;
import dao.FamilyAccountDAO;
import exceptions.InsertException;
import region.Region;

public  class AccountBLL {
	
	private FamilyAccountDAO familyAccount;
	private EnterpriseAccountDAO enterpriseAccount;
	
	public AccountBLL(){
		familyAccount= new FamilyAccountDAO();
		enterpriseAccount= new EnterpriseAccountDAO();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public Integer addAccount(String type, Region region, Customer customer,String number,String endDate) throws InsertException{
		Account account = AccountFactory.getAccount(type, 0, region, customer, number, endDate);
		System.out.println(account.getCustomerSystemReference());
		
		switch(type){
			case "Family Account":
				return familyAccount.add((FamilyAccount) account);
			case "Enterprise Account":
				return enterpriseAccount.add((EnterpriseAccount) account);
			default:
				return null;
		}
	
			
	}
	
	public void applyPromotion(){
		
	}
	
	public void presentReport(String idValue){
		//--------------------------------------------------------------------------- get account from data base, based on id;
		
		Account account=(Account) familyAccount.getByField("id", idValue);
		//account.generateReport();
	}
	
	
}
