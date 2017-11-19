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
	private double value;
	
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
	
	
	public Service(Region locationFrom, String number, double value){
		this.locationFrom=locationFrom;
		this.locationFromString = locationFrom.getRegionName();
		this.value=value;
		this.number=number;
	}
	
	public String getReferenceNumber() {
		return referenceNumber;
	}

	public String getUniqueIdentifierFieldValue(){
		return "referenceNumber";
	}

	public abstract void setReferenceNumber(String referenceNumber);


	public abstract boolean applyPrice(double roamingTax);            ////////////////////// returns true if international service or false otherwise
	
	public abstract double getInfo();
	
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


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return  id + ","  + locationFromString + "," + number + "," + cost+","+ value;
	}

}
