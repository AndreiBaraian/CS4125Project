package main;


import computeTransaction.ComputeTransaction;
import exceptions.InsertException;

public class Main {

	public static void main(String[] args) throws InsertException {
		
		/*
		Control control = Control.getInstance();
		Menu window = new Menu();
		window.getFrmMainMenu().setVisible(true);
		*/
		
		
		ComputeTransaction ct = new ComputeTransaction();
		ct.processServices();
		
		
		
		
		/*
		DataInsert dt = new DataInsert();
		dt.insertRegions();
		*/
	}

}