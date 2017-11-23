package bll;

import java.util.ArrayList;
import java.util.List;

import account.Account;
import account.AccountFactory;
import account.EnterpriseAccount;
import account.FamilyAccount;
import customer.Customer;
import dao.AbstractDAO;
import dao.AccountDAO;
import dao.EnterpriseAccountDAO;
import dao.FamilyAccountDAO;
import exceptions.InsertException;
import promotion.PromotionFactory;
import region.Region;

public class AccountBLL<T extends Account> {
	
	private AbstractDAO<T> abstractDAO;
	private AccountDAO accountDAO;
	
	public AccountBLL() {}
	
	public AccountBLL(AbstractDAO<T> abstractDAO) {
		this.abstractDAO = abstractDAO;
	}
	
	
	@SuppressWarnings("unchecked")
	public Account addAccount(String type, Region region, Customer customer,String number,String endDate) throws InsertException{
		Integer id = null;
		Account account = AccountFactory.getAccount(type, 0.0, region, customer, number, endDate);
		id = abstractDAO.add((T) account);
		account.setId(id);
		return account;
	}
	
     public Account getAccountByNumber(String number){  // this is the function for using number to get account by Andrei
		List<?> listAccounts = null;
		Account account = null;
		accountDAO = new EnterpriseAccountDAO();
		listAccounts = accountDAO.getByField("number", number);
		if(listAccounts == null){
			accountDAO = new FamilyAccountDAO();
			listAccounts = accountDAO.getByField("numbersString", number);
			account = (FamilyAccount) listAccounts.get(0);
		}
		else{
			account = (EnterpriseAccount) listAccounts.get(0);
		}
		return account;
	}
	
	public Account getAccount(String id){   //this is the function for using number to get account by Conrad
		List<?> listAccounts = null;
		Account account = null;
		accountDAO = new EnterpriseAccountDAO();
		listAccounts = accountDAO.getByField("id", id);
		if(listAccounts == null){
			accountDAO = new FamilyAccountDAO();
			listAccounts = accountDAO.getByField("id", id);
			account = (FamilyAccount) listAccounts.get(0);
		}
		else{
			account = (EnterpriseAccount) listAccounts.get(0);
		}
		return account;
	}
	
	@SuppressWarnings("unchecked")
	public void modifyAccount(Account newAccount){
		if(newAccount.getClass().getSimpleName() == "EnterpriseAccount"){
			accountDAO = new EnterpriseAccountDAO();
		}
		else
			accountDAO = new FamilyAccountDAO();
		accountDAO.modify(newAccount);
	}
	
	@SuppressWarnings("unchecked")
	public List<String> applyPromotion(String promotionType,String accountId){
		List<String> recievedAttributes = new ArrayList<String>();
		Account retrievedAccount = abstractDAO.getByField("id", accountId).get(0);
		Account promotedAccount = PromotionFactory.applyPromotion(promotionType, retrievedAccount);
		System.out.println(promotedAccount.toString());
		abstractDAO.modify((T) promotedAccount);
		recievedAttributes.add(Integer.toString(promotedAccount.getMinutes()));
		recievedAttributes.add(Integer.toString(promotedAccount.getMessages()));
		return recievedAttributes;
	}
	public List<T> getAll(){
		List<T> accounts = new ArrayList<T>();
		
		accounts = abstractDAO.getAll();
		return accounts;
	}
	public void presentReport(String accountId){
		//--------------------------------------------------------------------------- get account from data base, based on id;
		
		Account account =  abstractDAO.getByField("id", accountId).get(0);
		account.generateReport(account.getMinutes(),account.getMessages(),account.getMobileData(),account.getInternationalMinutes(),account.getDifferentProviderMinutes(),account.getBalance());
	}
}
