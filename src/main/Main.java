package main;

import bll.AccountBLL;
import customer.Customer;
import exceptions.InsertException;
import gui.Menu;
import region.Region;
import region.Romania;

public class Main {

	public static void main(String[] args) throws InsertException {
		
		/*
		//Control c= Control.getInstance();
		Menu window = new Menu();
		window.getFrmMainMenu().setVisible(true);
		*/
		
		
		AccountBLL e = new AccountBLL();
		Region reg = new Romania();
		Customer cust = new Customer("Andrei", "Baraian",21,"Bihorului","andrei@gmail.com");
		cust.setSystemReference("ref2");
		e.addAccount("Enterprise", reg, cust, "0004354353", "3DEC");
		
		
		/*
		CustomerBLL cb = new CustomerBLL();
		Customer luci = cb.add("Lucian", "Epure", 20, "Observator", "luci@gmail.com");
		Region romania = new Romania(23,23);
		AccountBLL ac = new FamilyAccountBLL();
		ac.addAccount("Family", romania, luci, "005463450", "34243242");
		*/
		
		/*
		Region romania = new Romania(23,23);
		Service msg = new Call(romania, "05353450", romania, 50);
		CallDAO md = new CallDAO();
		md.add((Call)msg);
		*/
	}

}