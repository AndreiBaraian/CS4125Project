package main;

import control.Control;
import exceptions.InsertException;
import gui.Menu;
import insertions.DataInsert;

public class Main {

	public static void main(String[] args) throws InsertException {
		
		
		Control control = Control.getInstance();
		Menu window = new Menu();
		window.getFrmMainMenu().setVisible(true);
		
		
		DataInsert dt = new DataInsert();
		//dt.insertCustomersAndAccounts();
		dt.insertRegions();
		
	}

}