package account;

/*
 * @author Andrei Baraian 5% Hibernate annotations
 */

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import customer.Customer;
import dao.DBRecord;
import region.Region;
import report.Report;

@MappedSuperclass
public abstract class Account extends DBRecord{

	@Column(name = "balance")
	private double balance;
	
	@Transient
	private Region homeRegion;
	
	@Column(name = "homeRegion")
	private String homeRegionString;
	
	@Transient
	private Customer customer;
	
	@Column(name = "customerName")
	private String customerName;
	
	@Column(name = "customerId")
	private String customerId;

	public Account() {}
	
	public Account(double balance, Region homeRegion,Customer customer) {
		this.customer = customer;
		this.balance = balance;
		this.homeRegion = homeRegion;
		this.homeRegionString = homeRegion.toString();
		this.customerName = customer.getName();
		this.customerId = customer.getId();
		this.uniqueIdentifierFieldName = "customerId";
	}
	
	public abstract Report generateReport(double spentMinutes, double spentMessages, double usedMobileData, double leftMinutes, double leftMessages, double leftMobileData, double costUntilNow);
	
	public abstract void computeDiscount();
	
	@Override
	public String getReferenceNumber(){
		return customerId;
	}
	
	@Override
	public void setUniqueIdentifierFieldName(){
		this.uniqueIdentifierFieldName = "customerId";
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Region getHomeregion() {
		return homeRegion;
	}

	public void setHomeregion(Region homeRegion) {
		this.homeRegion = homeRegion;
	}
	
	public String getHomeRegionString() {
		return homeRegionString;
	}

	public void setHomeRegionString(String homeRegionString) {
		this.homeRegionString = homeRegionString;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
}
