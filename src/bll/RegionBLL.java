package bll;

import control.Control;
import dao.AbstractDAO;
import dao.RegionDAO;
import exceptions.InsertException;
import region.Region;

public class RegionBLL {
	
	private AbstractDAO<Region> regionDAO;
	private Control c;
	public RegionBLL(){
		this.regionDAO = new RegionDAO();
		c=Control.getInstance();
	}
	
	public Integer add(Region region) throws InsertException{
		return regionDAO.add(region);
	}
	
	public void modifyPrice(String regionName, double newPrice, String service){
		Region selectedRegion=c.search(regionName);
		if(service.equalsIgnoreCase("call"))
			selectedRegion.setCallingPrice(newPrice);
		else if(service.equalsIgnoreCase("message"))
			selectedRegion.setMessagePrice(newPrice);
		else
			selectedRegion.setInternetPrice(newPrice);
		
		System.out.println(selectedRegion.getCallingPrice());
		System.out.println(selectedRegion.getMessagePrice());
		System.out.println(selectedRegion.getInternetPrice());
	}
	

}
