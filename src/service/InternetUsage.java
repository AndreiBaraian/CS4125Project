package service;
/**
 * @author Lucian Epure 
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import region.Region;

@Entity
@Table(name = "internetusage")
public class InternetUsage extends Service{

	@Column(name = "speed")
	private double speed;
	
	@Column(name = "traffic")
	private int traffic;
	
	public InternetUsage(Region locationFrom, String number, float traffic) {
		super(locationFrom, number,traffic);
		this.traffic= (int)traffic;
	}
	
	@Override
	public void applyPrice(double price) {
		super.setCost(price*((float)traffic/1000));
	}
	
	public int getTraffic() {
		return traffic;
	}
	public void setTraffic(int traffic) {
		this.traffic = traffic;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = "REF-" + referenceNumber;
	}
	
}
