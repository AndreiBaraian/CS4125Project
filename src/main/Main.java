package main;

import control.Control;
import dao.CallDAO;
import gui.Menu;
import service.Call;

public class Main {

	public static void main(String[] args) {
		
		
		Control c= new Control();
		Menu window = new Menu(c);
		window.getFrmMainMenu().setVisible(true);
		
		CallDAO cdao = new CallDAO();
		for(Call ca : cdao.getAll()){
			System.out.println(ca.getId() + ca.getLocationFromString());
		}
		
		System.out.println("Hello!");
	}

}
