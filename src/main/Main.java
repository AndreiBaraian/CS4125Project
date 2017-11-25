package main;

import exceptions.InsertException;
import view.Menu;

public class Main {

	public static void main(String[] args) throws InsertException {
		
		//DataInsert dt = new DataInsert();
		//dt.insertCustomersAndAccounts();
		//dt.insertRegions();

		Menu window = new Menu();
		window.getFrmMainMenu().setVisible(true);
		
		/*ComputeTransaction ct = new ComputeTransaction();
		ct.processServices();
		*/
		
		//CustomerBLL c = new CustomerBLL();
		//Customer cust = c.getCustomer("REF-AB-2017/11/23-00000000");
		//System.out.println(cust.toString());

	}

}