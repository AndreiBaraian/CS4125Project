package region;

/**
 * @author Andrei Baraian
 */

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("RO")
public class Romania extends Region {
	
	public Romania() {}
	
	public Romania(double callPrice, double percent) {
		this.regionName = "Romania";
		this.setCallingPrice(callPrice);
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
	public String getUniqueIdentifierFieldValue() {
		return regionName;
	}

	@Override
	public void setRegionName(String regionName) {
		this.regionName = "Romania";
	}

}
