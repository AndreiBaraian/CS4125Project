package main;

import bll.RegionBLL;
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
		
		Region romania = new Romania(23,12);
		RegionBLL rb = new RegionBLL();
		rb.add(romania);
		
	}

}