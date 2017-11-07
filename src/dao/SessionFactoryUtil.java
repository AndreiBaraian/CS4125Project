package dao;

/**
 * @author Andrei Baraian
 */

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getInstance() {
		if(sessionFactory == null) {
			sessionFactory = (new Configuration()).configure().buildSessionFactory();
		}
		return sessionFactory;
	}

}
