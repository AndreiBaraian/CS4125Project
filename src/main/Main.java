package main;

import java.util.ArrayList;
import java.util.List;

import account.Account;
import account.FamilyAccount;
import control.Control;
import customer.Customer;
import dao.FamilyAccountDAO;
import exceptions.InsertException;
import gui.Menu;
import region.Region;

public class Main {

	public static void main(String[] args) {
		
		
		Control c= new Control();
		Menu window = new Menu(c);
		window.getFrmMainMenu().setVisible(true);
		
		/*
		CallDAO cdao = new CallDAO();
		for(Call ca : cdao.getAll()){
			System.out.println(ca.getId() + ca.getLocationFromString());
		}*/
		
		List<String> numbers = new ArrayList<String>();
		numbers.add("072354345");
		numbers.add("074358645");
		numbers.add("072444335");
		numbers.add("072357909");
		Region Germany = new Region("Germany");
		Customer cust = new Customer("12","Andrei", 21, "Bihorului", "andrei@gmail.com");
		FamilyAccount acc = new FamilyAccount(45.2,Germany, cust, numbers);
		System.out.println(acc.getNumbersString());
		
		FamilyAccountDAO accDAO = new FamilyAccountDAO();
		try {
			accDAO.add(acc);
		} catch (InsertException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Hello!");
	}

}
