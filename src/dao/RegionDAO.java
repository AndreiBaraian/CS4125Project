package dao;

/**
 *  @author Andrei Baraian
 */

import region.Region;

public class RegionDAO extends AbstractDAO<Region> {
	
	public RegionDAO(){
		this.uniqueIdentifierFieldName = "regionName";
	}

}
