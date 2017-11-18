package main;

import control.Control;
import exceptions.InsertException;
import gui.Menu;

public class Main {

	public static void main(String[] args) throws InsertException {
		
		Control c = Control.getInstance();
		Menu window = new Menu();
		window.getFrmMainMenu().setVisible(true);
		
		/*
		DataInsert dt = new DataInsert();
		dt.insertCustomersAndAccounts();
		*/
	}

}