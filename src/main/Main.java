package main;

import dao.CallDAO;
import region.Region;
import service.Call;

public class Main {

	public static void main(String[] args) {
		
		//Control c= new Control();
		//Menu window = new Menu(c);
		//window.getFrmMainMenu().setVisible(true);
		
		CallDAO cdao = new CallDAO();
		Region Romania = new Region("Romania");
		Region Ireland = new Region("Ireland");
		Call c1 = new Call(Romania, "0727566956", Ireland, 14);
		c1.setCost(3);
		System.out.println(c1.getNumber());
		System.out.println(c1.getLocationFromString());
		System.out.println(cdao.add(c1));
		
		System.out.println("Hello!");
		
	}

}
