package main;

import bll.AccountBLL;
import bll.CustomerBLL;
import bll.EnterpriseAccountBLL;
import bll.FamilyAccountBLL;
import customer.Customer;
import exceptions.InsertException;
import region.Region;
import region.Romania;

public class Main {

	public static void main(String[] args) throws InsertException {
		
		/*
		Control c= new Control();
		Menu window = new Menu(c);
		window.getFrmMainMenu().setVisible(true);
		*/
		
		/*
		EnterpriseAccountBLL e = new EnterpriseAccountBLL();
		Region reg = new Region("Romania");
		Customer cust = new Customer("Andrei", "Baraian",21,"Bihorului","andrei@gmail.com");
		cust.setSystemReference("ref");
		e.createAccount("Enterprise", reg, cust, "0004354353", "3DEC");
		*/
		
		/*
		CustomerBLL cb = new CustomerBLL();
		Customer luci = cb.add("Lucian", "Epure", 20, "Observator", "luci@gmail.com");
		Region romania = new Romania(23,23);
		AccountBLL ac = new FamilyAccountBLL();
		ac.addAccount("Family", romania, luci, "005463450", "34243242");
		*/
		
		
	}

}