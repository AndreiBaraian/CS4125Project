package main;


import view.Menu;
import account.Account;
import account.EnterpriseAccount;
import computeTransaction.ComputeTransaction;
import computeTransaction.CreatedAccount;
import computeTransaction.UpdateAccountContext;
import control.Control;
import customer.Customer;
import exceptions.InsertException;
import insertions.DataInsert;
import region.Romania;
import service.Call;

public class Main {

	public static void main(String[] args) throws InsertException {
		
		
		Control control = Control.getInstance();
		Menu window = new Menu();
		window.getFrmMainMenu().setVisible(true);
		
		//// LUCIAN TESTING (don't remove until computeTransaction works)
		/*ComputeTransaction cT= new ComputeTransaction();
		Customer customer = new Customer();
		Account account = new EnterpriseAccount(0,new Romania(10,5),customer,"dada","fdfad");
		Call call= new Call(new Romania(10,5),"dsads",new Romania(10,5),45);
		UpdateAccountContext updateAccountContext = new UpdateAccountContext(new CreatedAccount(), account ,call, 0);
		Account account2 = updateAccountContext.updateAccount();
		System.out.println("Here"+account2.getBalance());
	\
		*/
		
///
		//DataInsert dt = new DataInsert();
		///dt.insertCustomersAndAccounts();
		//dt.insertRegions();
		

	}

}