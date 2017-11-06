package region;

public class Region {
	
	private double callingPrice;
	private double roamingTax;
	private String name;
	
	public Region() {}
	
	public Region(String name) {
		this.name=name;
	}
	
	public void computeRoamingTax(int percent) {
		float roaming= (float)(this.callingPrice * percent)/100;
		this.setRoamingTax(roaming);
	}
	
	public double getRoamingTax() {
		return roamingTax;
	}
	
	public void setRoamingTax(double roamingTax) {
		this.roamingTax = roamingTax;
	}
	
	public double getCallPrice() {
		return callingPrice;
	}
	
	public void setCallPrice(double callPrice) {
		this.callingPrice = callPrice;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return name;
	}
	
}
