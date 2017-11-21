package service;
/**
 * @author Lucian Epure 
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import region.Region;

@Entity
@Table(name = "tb_message")
public class Message extends Service{

	@Transient
	private double quantity;
	
	@Transient
	private Region locationTo;
	
	@Column(name = "locationTo")
	private String locationToString;
	
	@Column(name = "limitMsg")
	private int limit;
	
	@Column(name = "words")
	private int nrOfWords;
	
	public Message(Region locationFrom, String number, Region locationTo, int nrOfWords) {
		super(locationFrom, number,nrOfWords);
		this.locationTo=locationTo;
		this.nrOfWords=(int)nrOfWords;
		this.locationToString = locationTo.getClass().getSimpleName();
		this.quantity =  Math.ceil((float)nrOfWords/limit);
		this.limit = 0;
	}
	
	@Override
	public boolean applyPrice(double roamingTax) {
		double price;
		boolean international;
		if(locationFromString.equalsIgnoreCase(locationToString)){
			price = roamingTax+locationFrom.getMessagePrice() * quantity;
			international = false;
		}
		else{
			price = roamingTax+locationTo.getMessagePrice()/2+locationFrom.getMessagePrice() * quantity;
			international = true;
		}
		super.setCost(price) ;
		return international;
	}
	public Region getLocationTo() {
		return locationTo;
	}
	public void setLocationTo(Region locationTo) {
		this.locationTo = locationTo;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getNrOfWords() {
		return nrOfWords;
	}
	public void setNrOfWords(int nrOfWords) {
		this.nrOfWords = nrOfWords;
	}

	@Override
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = "REF-" + referenceNumber;
	}

	@Override
	public String toString() {
		return locationFromString + "," + number + "," + cost + "," + locationToString + "," + nrOfWords;
	}
	public double getInfo() {
		return quantity;
	}

}
