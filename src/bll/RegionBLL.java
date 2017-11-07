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
	
	public Integer add(String name, double callingPrice, double percent) throws InsertException{
		Region region = new Region(name);
		region.setCallingPrice(callingPrice);
		region.computeRoamingTax(percent);
		return regionDAO.add(region);
	}

}
