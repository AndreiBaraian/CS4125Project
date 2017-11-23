package region;

public class RegionFactory {
	
	public static Region getRegion(Region region){
		Region customRegion = null;
		if(region.getRegionName() == "Romania")
			customRegion = new Romania();
		if(region.getRegionName() == "China")
			customRegion = new China();
		if(region.getRegionName() == "Ireland")
			customRegion = new Ireland();
		return customRegion;
	}

}
