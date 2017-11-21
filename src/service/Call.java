package service;
/**
 * @author Lucian Epure 
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import region.Region;

@Entity
@Table(name = "tb_call")
public class Call extends Service implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Transient
	private Region locationTo;
	
	@Column(name = "locationTo")
	private String locationToString;
	
	@Column(name = "duration")
	private int duration;
	
	public Call(){ }
	
	public Call(Region locationFrom, String number, Region locationTo, int duration) {
		super(locationFrom, number, duration);
		this.locationTo = locationTo;
		this.locationToString = locationTo.getRegionName();
		this.duration = duration;
	}

	@Override
	public void applyPrice(double roamingTax) { 	
		double price;
		if(locationFromString.equalsIgnoreCase(locationToString)){
			price = roamingTax+locationFrom.getCallingPrice()*duration;
			this.international = false;
		}
		else{
			price = roamingTax+locationTo.getCallingPrice()/2+locationFrom.getCallingPrice();
			this.international = true;
		}
		super.setCost(price);
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Transient
	public Region getLocationTo() {
		return locationTo;
	}
	public void setLocationTo(Region locationTo) {
		this.locationTo = locationTo;
	}

	@Override
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = "REF-" + referenceNumber;
	}

	@Override
	public String toString() {
		return locationFromString + "," + number + "," + cost + "," + locationToString + "," + duration;
	}
	
	public double getInfo() {
		return duration;
	}

	@Override
	public String changed() {
		return "Minutes";
	}

	@Override
	public void applyCustomerPrice(int duration, double roamingTax) {
		this.customerCost = roamingTax + (duration * this.getLocationTo().getCallingPrice());		
	}

}
