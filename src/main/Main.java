package main;

import java.util.ArrayList;
import java.util.List;

import control.Control;
import dao.CallDAO;
import gui.Menu;
import region.Region;
import service.Call;
import account.*;
import account.Number;
import promotion.*;
import report.*;

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
		
		/*
		Customer conrad = new Customer("140556235", "conrad", 21, "Troy", "Active", "17080118@studentmail.ul.ie");
		Customer lucian = new Customer("140556235", "lucian", 21, "Troy", "Active", "17080118@studentmail.ul.ie");
		Customer andrei = new Customer("140556235", "andrei", 21, "Troy", "Active", "17080118@studentmail.ul.ie");
		*/
		
		//Account SurferPromotionEnterpriseAccount = new SurferPromotion(new EnterpriseAccount(50,new Region("China"),new SurferPromotion(50, 365, 10, 1000),conrad,"2017-10-31","083-123456"),conrad);
		//SurferPromotionEnterpriseAccount.generateReport(20, 20, 10, 30, 40, 50, 70);
		
		//Account TravelerPromotionEnterpriseAccount = new TravelerPromotion(new EnterpriseAccount(50,new Region("Romania"),new SurferPromotion(50, 365, 10, 1000),lucian,"2017-10-31","083-123456"),lucian);
		//TravelerPromotionEnterpriseAccount.generateReport(10, 20, 30, 50, 440, 50, 80);
		
		//Account FriendPromotionEnterpriseAccount = new TravelerPromotion(new EnterpriseAccount(50,new Region("Ireland"),new SurferPromotion(50, 365, 10, 1000),andrei,"2017-10-31","083-123456"),andrei);
		//FriendPromotionEnterpriseAccount.generateReport(10, 20, 30, 40, 50, 60, 70);
		
		/*
		Number n1 = new Number("083-1234567");
		Number n2 = new Number("083-123456789");
		Number n3 = new Number("083-987654321");
		List<Number> numbers = new ArrayList<Number>();
		numbers.add(n1);
		numbers.add(n2);
		numbers.add(n3);
		*/
		
		//Account SurferPromotionFamilyAccount = new SurferPromotion(new FamilyAccount(50,new Region("China"),conrad,new SurferPromotion(50, 365, 10, 1000),3,numbers),conrad);
		//SurferPromotionFamilyAccount.generateReport(10, 20, 30, 40, 50, 60, 70);
		
		//Account TravelerPromotionFamilyAccount = new SurferPromotion(new FamilyAccount(50,new Region("China"),conrad,new SurferPromotion(50, 365, 10, 1000),3,numbers),conrad);
		//TravelerPromotionFamilyAccount.generateReport(10, 20, 30, 40, 50, 60, 70);
		
		//Account FriendPromotionFamilyAccount = new SurferPromotion(new FamilyAccount(50,new Region("China"),conrad,new SurferPromotion(50, 365, 10, 1000),3,numbers),conrad);
		//FriendPromotionFamilyAccount.generateReport(10, 20, 30, 40, 50, 60, 70);
	}

}
