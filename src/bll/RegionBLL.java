package bll;

import java.util.ArrayList;
import java.util.List;

import dao.AbstractDAO;
import dao.RegionDAO;
import exceptions.InsertException;
import region.Region;
import region.RegionFactory;

public class RegionBLL {
	
	private AbstractDAO<Region> regionDAO;
	private List<Region> regions;
	
	public RegionBLL(){
		this.regionDAO = new RegionDAO();
		regions = getRegions();
	}
	
	public Integer add(Region region) throws InsertException{
		return regionDAO.add(region);
	}
	
	public void modifyPrice(String regionName, double newPrice, String service){
		Region selectedRegion = search(regionName);
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
	
	public List<Region> getRegions(){
		List<Region> regions = new ArrayList<Region>();
		regions = regionDAO.getAll();
		for(Region region : regions){
			region = RegionFactory.getRegion(region);
			//regions.add(region);
		}
		
		return regions;
	}
	
	public Region search(String name){
		for(Region region : regions){
			if(region.getRegionName().equals(name))
				return region;
		}
		return null;
	}

}
