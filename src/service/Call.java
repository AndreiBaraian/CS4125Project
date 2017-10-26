package service;

import region.Region;
import ccc.Number;
public class Call extends Service {

	
	public Call(Region locationFrom, Number number, Region locationTo, float duration) {
		super(locationFrom, number);
		this.locationTo=locationTo;
		this.duration=(int)duration;
	}
	private Region locationTo;
	private int duration;
	
	
	
	public void applyPrice(float price) {
		// TODO Auto-generated method stub
		super.setCost(price * this.duration);
		
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Region getLocationTo() {
		return locationTo;
	}
	public void setLocationTo(Region locationTo) {
		this.locationTo = locationTo;
	}

}
