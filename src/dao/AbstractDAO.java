package dao;

/**
 * @author Andrei Baraian 
 */

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import exceptions.InsertException;


public abstract class AbstractDAO<T extends DBRecord> {
	
	@SuppressWarnings("unchecked")
	protected final Class<T> parameterType = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	protected final SessionFactory sessionFactory = SessionFactoryUtil.getInstance();
	
	protected String uniqueIdentifierFieldName;
	
	public Integer add(T object) throws InsertException{
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(parameterType);
		Root<T> root = query.from(parameterType);
		query.select(root).where(builder.equal(root.get(uniqueIdentifierFieldName), object.getUniqueIdentifierFieldValue()));
		Query<T> q = session.createQuery(query);
        List<T> list = q.getResultList();
        if(list.size() == 0)
        	session.save(object);
        else
        	throw new InsertException();
		tx.commit();
		return object.getId();
	}
	
	public void modify(T newObject){
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			//T t = (T) session.get(parameterType, newObject.getId());
			session.update(newObject);
			tx.commit();
		}catch(HibernateException e){
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public List<T> getAll() {
		List<T> objects = null;
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<T> query = builder.createQuery(parameterType);
			Root<T> root = query.from(parameterType);
			query.select(root);
			Query<T> q = session.createQuery(query);
	        objects = q.getResultList();
	        tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			 if(tx != null)
				 tx.rollback();
		 }
		 return objects;
	}
	
	public List<T> getByField(String fieldName, String value){
		List<T> objects = null;
		Transaction tx = null;
		try (Session session = sessionFactory.openSession()){
			tx = session.beginTransaction();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<T> query = builder.createQuery(parameterType);
			Root<T> root = query.from(parameterType);
			query.select(root).where(builder.equal(root.get(fieldName), value));
			Query<T> q = session.createQuery(query);
	        objects = q.getResultList();
	        tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			 if(tx != null)
				 tx.rollback();
		 }
		if(objects.size() == 0)
			objects = null;
		return objects;
	}

}
