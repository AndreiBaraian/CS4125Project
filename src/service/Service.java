package service;
/**
 * @author Lucian Epure 
 */

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import dao.DBRecord;
import region.Region;

@MappedSuperclass
public abstract class Service extends DBRecord {
	
	@Transient
	protected int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Transient
	protected Region locationFrom;
	
	@Column(name = "locationFrom")
	protected String locationFromString;
	
	@Column(name = "number")
	protected String number;
	
	@Column(name = "cost")
	protected double cost;
	
	@Column(name = "referenceNumber")
	protected String referenceNumber;

	public Service() {}
	
	public Service(Region locationFrom, String number,int value){
		this.locationFrom = locationFrom;
		this.locationFromString = locationFrom.getRegionName();
		this.number = number;
		this.value = value;
	}
	
	public String getReferenceNumber() {
		return referenceNumber;
	}

	public String getUniqueIdentifierFieldValue(){
		return "referenceNumber";
	}

	public abstract void setReferenceNumber(String referenceNumber);


	public abstract void applyPrice(double roamingTax);
	
	public String getLocationFromString() {
		return locationFromString;
	}
	public void setLocationFromString(String locationFromString) {
		this.locationFromString = locationFromString;
	}

	public Region getLocationFrom() {
		return locationFrom;
	}
	public void setLocationFrom(Region locationFrom) {
		this.locationFrom = locationFrom;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public abstract String toString();

}
