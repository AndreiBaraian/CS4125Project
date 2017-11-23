package region;

/**
 * @author Andrei Baraian
 */

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("RO")
public class Romania extends Region {
	
	public Romania() {
		this.setRegionName("Romania");
	}
	
	public Romania(double callPrice, double internetPrice, double messagePrice, double percent) {
		super();
		this.setRegionName("Romania");
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
		this.regionName = "Romania";
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
