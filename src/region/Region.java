package region;

/**
 * @author Andrei Barian
 */

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import dao.DBRecord;

@Entity
@Table(name = "tb_region")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="regionCode", discriminatorType=DiscriminatorType.STRING)
public abstract class Region extends DBRecord{
	
	@Column(name = "callingPrice")
	protected double callingPrice;
	
	@Column(name = "roamingTax")
	protected double roamingTax;
	
	@Column(name = "regionName")
	protected String regionName;

	public Region() {}
	
	public abstract void computeRoamingTax(double percent);
	
	public double getRoamingTax() {
		return roamingTax;
	}
	
	public void setRoamingTax(double roamingTax) {
		this.roamingTax = roamingTax;
	}
	
	public double getCallingPrice() {
		return callingPrice;
	}
	
	public abstract void setCallingPrice(double callPrice);
	
	public String getRegionName() {
		return regionName;
	}

	public abstract void setRegionName(String regionName);
	
}
