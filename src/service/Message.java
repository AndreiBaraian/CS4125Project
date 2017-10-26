package service;

import region.Region;
import ccc.Number;
public class Message extends Service{

	
	
	private Region locationTo;
	private int limit;
	private int nrOfWords;
	
	public Message(Region locationFrom, Number number, Region locationTo, float nrOfWords) {
		super(locationFrom, number);
		this.locationTo=locationTo;
		this.nrOfWords=(int)nrOfWords;
	}
	@Override
	public void applyPrice(float price) {
		// TODO Auto-generated method stub
		
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

}
