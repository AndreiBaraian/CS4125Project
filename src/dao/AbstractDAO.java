package dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import service.Service;


public abstract class AbstractDAO<T extends Service> {
	
	@SuppressWarnings("unchecked")
	protected final Class<T> parameterType = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];
	
	protected final SessionFactory sessionFactory = SessionFactoryUtil.getInstance();
	
	public Integer add(T object){
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		//@SuppressWarnings("deprecation")
		//Criteria criteria = session.createCriteria(parameterType);
		//criteria.add(Restrictions.eq(propertyName, value))
		session.save(object);
		tx.commit();
		return object.getId();
	}

}
