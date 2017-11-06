package main;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import control.Control;
import dao.CallDAO;
import dao.SessionFactoryUtil;
import gui.Menu;
import service.Call;


public class Main {

	public static void main(String[] args) {

		Control c1= new Control();
		Menu window = new Menu(c1);
		window.getFrmMainMenu().setVisible(true);
		
		CallDAO cdao = new CallDAO();
		for(Call c : cdao.getAll()){
			System.out.println(c.getId() + c.getLocationFromString());
		}
		
		System.out.println("Hello!");
	}

}
