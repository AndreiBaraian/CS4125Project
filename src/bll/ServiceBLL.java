package bll;

import dao.AbstractDAO;
import exceptions.InsertException;
import service.Service;

public abstract class ServiceBLL<T extends Service> {
	
	private AbstractDAO<T> abstractDAO;
	
	public ServiceBLL(AbstractDAO<T> abstractDAO){
		this.abstractDAO = abstractDAO;
	}
	
	@SuppressWarnings("unchecked")
	public Integer addService(Service service) throws InsertException{
		Integer id = null;
		id = abstractDAO.add((T) service);
		return id;
	}
	
}
