package service;

import region.Region;
import ccc.Number;
public abstract class Service {
	
	private Region locationFrom;
	
	private Number number;
	private float cost;
	
	public Service(Region locationFrom, Number number)
	{
		this.locationFrom=locationFrom;
		this.number=number;
	}
	public abstract void applyPrice(float price);

	public Region getLocationFrom() {
		return locationFrom;
	}
	public void setLocationFrom(Region locationFrom) {
		this.locationFrom = locationFrom;
	}
	public Number getNumber() {
		return number;
	}
	public void setNumber(Number number) {
		this.number = number;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
}
