package main;

import control.Control;
import exceptions.InsertException;
import gui.Menu;

public class Main {

	public static void main(String[] args) throws InsertException {
		
		
		Control control = Control.getInstance();
		Menu window = new Menu();
		window.getFrmMainMenu().setVisible(true);
		
		/*
		ComputeTransaction ct = new ComputeTransaction();
		ct.processServices();
		*/
		
		/*
		DataInsert dt = new DataInsert();
		dt.insertRegions();
		*/
	}

}