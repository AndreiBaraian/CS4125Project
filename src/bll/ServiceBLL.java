package bll;

import dao.AbstractDAO;
import service.Service;

public abstract class ServiceBLL<T extends Service> {
	
	private AbstractDAO<T> abstractDAO;
	
	public ServiceBLL(AbstractDAO<T> abstractDAO){
		this.abstractDAO = abstractDAO;
	}
}
