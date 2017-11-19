package region;

public class RegionFactory {
	
	public static Region getRegion(Region region){
		Region customRegion = null;
		if(region.getRegionName() == "Romania")
			customRegion = new Romania();
		return customRegion;
	}

}
