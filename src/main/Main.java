package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.SessionFactoryUtil;
import model.Service;

public class Main {

	public static void main(String[] args) {
		
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
		
		System.out.println("Hello!");
		
	}

}
