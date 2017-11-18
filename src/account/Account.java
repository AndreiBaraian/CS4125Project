package account;

/**
 * @author Xiangkai Tang
 * @author Andrei Baraian 5% Hibernate annotations
 */

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import customer.Customer;
import dao.DBRecord;
import region.Region;
import report.Report;

@MappedSuperclass
public abstract class Account extends DBRecord{

	@Column(name = "differentProviderMinutes")
	private double differentProviderMinutes;
	
	@Column(name = "internationalMinutes")
	private int internationalMinutes;
	
	@Column(name = "mobileData")
	private double mobileData;
	
	@Column(name = "minutes")
	private int minutes;
	
	@Column(name = "duration")
	private double duration;
	
	@Column(name = "messages")
	private int messages;
	
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
	
	@Column(name = "customerSystemReference")
	protected String customerSystemReference;

	public Account() {}
	
	public Account(double balance, Region homeRegion,Customer customer) {
		this.customer = customer;
		this.balance = balance;
		this.homeRegion = homeRegion;
		this.homeRegionString = homeRegion.getClass().getSimpleName();
		this.customerName = customer.getFirstName() + " " + customer.getLastName();
		this.customerSystemReference = customer.getSystemReference();
		this.uniqueIdentifierFieldName = "customerId";
	}
	
	public abstract Report generateReport(int leftMinutes, int leftMessages,double leftMobileData, int leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow);
	
	public abstract void computeDiscount();
	
	@Override
	public String getUniqueIdentifierFieldValue(){
		return customerSystemReference;
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

	public String getCustomerSystemReference() {
		return customerSystemReference;
	}

	public void setCustomerSystemReference(String customerSystemReference) {
		this.customerSystemReference = customerSystemReference;
	}

	public int getMessages() {
		return messages;
	}

	public void setMessages(int messages) {
		this.messages = messages;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public double getDifferentProviderMinutes() {
		return differentProviderMinutes;
	}

	public void setDifferentProviderMinutes(double differentProviderMinutes) {
		this.differentProviderMinutes = differentProviderMinutes;
	}

	public int getInternationalMinutes() {
		return internationalMinutes;
	}

	public void setInternationalMinutes(int internationalMinutes) {
		this.internationalMinutes = internationalMinutes;
	}

	public double getMobileData() {
		return mobileData;
	}

	public void setMobileData(double mobileData) {
		this.mobileData = mobileData;
	}
	
}
