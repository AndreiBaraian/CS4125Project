package service;
import ccc.Number;
import region.Region;

public class InternetUsage extends Service{



	private float speed;
	private float traffic;
	
	
	public InternetUsage(Region locationFrom, Number number, float traffic) {
		super(locationFrom, number);
		this.traffic= traffic;
	}
	public void applyPrice(float price) {
		super.setCost(price*((float)traffic/1000));
	}
	public float getTraffic() {
		return traffic;
	}
	public void setTraffic(float traffic) {
		this.traffic = traffic;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}

}
