package dao;

/**
 * @author Andrei Baraian 
 */

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import exceptions.InsertException;
import service.Service;


public abstract class AbstractDAO<T extends Service> {
	
	@SuppressWarnings("unchecked")
	protected final Class<T> parameterType = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];
	
	protected final SessionFactory sessionFactory = SessionFactoryUtil.getInstance();
	
	protected String uniqueIdentifierFieldName;
	
	public Integer add(T object) throws InsertException{
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(parameterType);
		Root<T> root = query.from(parameterType);
		query.select(root).where(builder.equal(root.get(uniqueIdentifierFieldName), object.getReferenceNumber()));
		Query<T> q = session.createQuery(query);
        List<T> list = q.getResultList();
        if(list.size() == 0)
        	session.save(object);
        else
        	throw new InsertException();
		tx.commit();
		return object.getId();
	}
	
	

}
