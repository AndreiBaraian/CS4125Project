package main;

import dao.CallDAO;
import dao.MessageDAO;
import service.Call;

public class Main {

	public static void main(String[] args) {
		
		/*
		Control c= new Control();
		Menu window = new Menu(c);
		window.getFrmMainMenu().setVisible(true);
		*/
		CallDAO cdao = new CallDAO();
		for(Call c : cdao.getAll()){
			System.out.println(c.getId() + c.getLocationFromString());
		}
		
		System.out.println("Hello!");
		
	}

}
