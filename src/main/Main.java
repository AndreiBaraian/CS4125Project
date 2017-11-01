package main;

import control.Control;
import dao.CallDAO;
import exceptions.InsertException;
import gui.Menu;
import region.Region;
import service.Call;

public class Main {

	public static void main(String[] args) {
		
		/*
		Control c= new Control();
		Menu window = new Menu(c);
		window.getFrmMainMenu().setVisible(true);
		*/
		
		CallDAO cdao = new CallDAO();
		Region Romania = new Region("Romania");
		Region Ireland = new Region("Ireland");
		Call c1 = new Call(Romania, "0727566956", Ireland, 14);
		c1.setCost(3);
		System.out.println(c1.getNumber());
		System.out.println(c1.getLocationFromString());
		c1.setReferenceNumber("1");
		try {
			System.out.println(cdao.add(c1));
		} catch (InsertException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello!");
		
	}

}
