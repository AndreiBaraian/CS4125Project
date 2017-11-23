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
public abstract class Service extends DBRecord implements IService{
	
	@Transient
	protected int value;
	
	@Transient 
	protected double customerCost;
	
	@Transient 
	protected boolean international;

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
	public abstract String changed();
	
	public String getReferenceNumber() {
		return referenceNumber;
	}

	public String getUniqueIdentifierFieldValue(){
		return "referenceNumber";
	}

	public abstract void setReferenceNumber(String referenceNumber);


	public abstract void applyPrice(double roamingTax);            ////////////////////// returns true if international service or false otherwise
	
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
	public boolean getInternational(){
		return this.international;
	}
	public void setInternational(boolean international){
		this.international = international;
	}
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public void setCustomerCost(double value){
		this.customerCost = value;
	}
	public double getCustomerCost(){
		return this.customerCost;
	}

	@Override
	public abstract String toString();

	public void applyCustomerPrice(double abs, double roamingTax) {
		// TODO Auto-generated method stub
		
	}

}
