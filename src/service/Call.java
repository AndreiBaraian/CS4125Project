package service;

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
	
	public Call(Region locationFrom, String number, Region locationTo, float duration) {
		super(locationFrom, number);
		this.locationFromString = locationFrom.toString();
		this.locationTo=locationTo;
		this.locationToString = locationTo.toString();
		this.duration=(int)duration;
	}
	
	@Override
	public void applyPrice(double price) {
		super.setCost(price * this.duration);
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

}
