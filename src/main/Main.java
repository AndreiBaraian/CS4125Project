package main;

import control.Control;
import dao.CallDAO;
import gui.Menu;
import region.Region;
import service.Call;

public class Main {

	public static void main(String[] args) {
		
	/*	Control c= new Control();
		Menu window = new Menu(c);
		window.getFrmMainMenu().setVisible(true);
		
		Service s1 = new Service();
		Service s2 = new Service();
		s1.setName("Call");
		s2.setName("Mobile Data");
		s1.setId(3L);
		s2.setId(5L);
		s1.setRegion("Romania");
		s2.setRegion("France");
		
		SessionFactory sessionFactory = SessionFactoryUtil.getInstance();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		tx.commit();
		session.disconnect();

		
		CallDAO cdao = new CallDAO();
		Region Romania = new Region("Romania");
		Region Ireland = new Region("Ireland");
		Call c1 = new Call(Romania, "0727566956", Ireland, 14);
		c1.setCost(3);
		System.out.println(c1.getNumber());
		System.out.println(c1.getLocationFromString());
		System.out.println(cdao.add(c1));

		
		System.out.println("Hello!");
		*/
	}

}
