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
	
	public Call(Region locationFrom, String number, Region locationTo, double duration) {
		super(locationFrom, number,duration);
		this.locationFromString = locationFrom.toString();
		this.locationTo=locationTo;
		this.locationToString = locationTo.toString();
		this.duration=(int)duration;
	}

	@Override
	public void applyPrice(double roamingTax) { //--------------------------modify this to take care of the location
		//-----------------------------------------------------based on number, obtain homeRegion of the caller
		double price=roamingTax+locationTo.getCallingPrice()*duration;
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

}
