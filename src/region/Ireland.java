package region;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/*
 * @author Xiangkai Tang
 */

@Entity
@DiscriminatorValue("IRE")
public class Ireland extends Region {
	
	public Ireland() {
		this.setRegionName("Ireland");
	}
	
	public Ireland(double callPrice, double internetPrice, double messagePrice, double percent) {
		super();
		this.setRegionName("Ireland");
		this.setCallingPrice(callPrice);
		this.setInternetPrice(internetPrice);
		this.setMessagePrice(messagePrice);
		this.computeRoamingTax(percent);
	}
	
	@Override
	public void setCallingPrice(double callPrice) {
		this.callingPrice = callPrice;
	}
	
	@Override
	public void computeRoamingTax(double percent) {
		double roaming = (double)(this.callingPrice * percent)/100;
		this.roamingTax = roaming;
	}
 
	@Override
	public String getRegionName() {
		return regionName;
	}

	@Override
	public void setRegionName(String regionName) {
		this.regionName = "Ireland";
	}

	@Override
	public String getUniqueIdentifierFieldValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMessagePrice(double messagePrice) {
		this.messagePrice=messagePrice;
		
	}

	@Override
	public void setInternetPrice(double internetPrice) {
		this.internetPrice=internetPrice;
		
	}

}
