package region;

public class Region {
	private float callingPrice;
	private float roamingTax;
	private String name;
	
	public Region()
	{
		
	}
	public Region(String name)
	{
		this.name=name;
	}
	public void computeRoamingTax(int percent)
	{
		float roaming= (float)(this.callingPrice * percent)/100;
		this.setRoamingTax(roaming);
		
	}
	public float getRoamingTax() {
		return roamingTax;
	}
	public void setRoamingTax(float roamingTax) {
		this.roamingTax = roamingTax;
	}
	public float getCallPrice() {
		return callingPrice;
	}
	public void setCallPrice(float callPrice) {
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
