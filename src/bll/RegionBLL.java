package bll;

import dao.AbstractDAO;
import dao.RegionDAO;
import exceptions.InsertException;
import region.Region;

public class RegionBLL {
	
	private AbstractDAO<Region> regionDAO;
	
	public RegionBLL(){
		this.regionDAO = new RegionDAO();
	}
	
	public Integer add(Region region) throws InsertException{
		return regionDAO.add(region);
	}

}
