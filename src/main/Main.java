package main;

import exceptions.InsertException;
import insertions.DataInsert;

public class Main {

	public static void main(String[] args) throws InsertException {
		
		/*
		Control c = Control.getInstance();
		Menu window = new Menu();
		window.getFrmMainMenu().setVisible(true);
		*/
		
		DataInsert dt = new DataInsert();
		dt.insertCustomersAndAccounts();
		
	}

}