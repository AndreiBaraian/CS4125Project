package bll;

import account.Account;
import account.AccountFactory;
import customer.Customer;
import dao.AbstractDAO;
import dao.AccountDAO;
import dao.EnterpriseAccountDAO;
import exceptions.InsertException;
import region.Region;

public class AccountBLL {
	
	public AccountBLL() {}
	
	@SuppressWarnings("unchecked")
	public Integer addAccount(String type, Region region, Customer customer,String number,String endDate) throws InsertException{
		Account account = AccountFactory.getAccount(type, 0, region, customer, number, endDate);
		System.out.println(account.getCustomerSystemReference());
		Integer id = getDAO(type).add(account);
		return id;
	}
	
	public void applyPromotion(){
		
	}
	
	@SuppressWarnings("rawtypes")
	private AccountDAO getDAO(String type){
		AccountDAO accDAO;
		switch (type){
		case "Enterprise": 
				accDAO = new EnterpriseAccountDAO();
				break;
		case "Family" :
			//accDAO = new FamilyAccountDAO();
		default: 
			accDAO = null;
			break;
		}
		return accDAO;
	}
	
}
