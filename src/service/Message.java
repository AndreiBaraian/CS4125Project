package service;
/**
 * @author Lucian Epure 
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import region.Region;

@Entity
@Table(name = "message")
public class Message extends Service{

	private Region locationTo;
	
	@Column(name = "locationTo")
	private String locationToString;
	
	@Column(name = "limit")
	private int limit;
	
	@Column(name = "words")
	private int nrOfWords;
	
	public Message(Region locationFrom, String number, Region locationTo, float nrOfWords) {
		super(locationFrom, number,nrOfWords);
		this.locationTo=locationTo;
		this.nrOfWords=(int)nrOfWords;
		this.locationToString = locationTo.toString();
	}
	
	@Override
	public void applyPrice(double price) {
		super.setCost((float) (price * (Math.ceil((float)nrOfWords/limit)))) ;
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

}
