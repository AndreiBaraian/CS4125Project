package account;
/*
 * @author Lucian Epure 40% observer 
 */
import java.util.Observable;
import java.util.Observer;

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
public abstract class Account extends DBRecord implements IAccount,ObserverSubject{

	@Column(name = "differentProviderMinutes")
	private double differentProviderMinutes;
	
	@Column(name = "internationalMinutes")
	private int internationalMinutes;
	
	@Column(name = "mobileData")
	private double mobileData;
	
	@Column(name = "minutes")
	private int minutes;
	
	@Column(name = "messages")
	private int messages;
	
	@Column(name = "balance")
	protected double balance;
	
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
	
	@Transient
	private Observer accountObserver;
	
	public Account() {

	}
	
	public Account(double balance, Region homeRegion,Customer customer) {
		this.messages=0;
		this.minutes=0;
		this.internationalMinutes=0;
		this.mobileData=0;
		this.customer = customer;
		this.balance = balance;
		this.homeRegion = homeRegion;
		this.homeRegionString = homeRegion.getClass().getSimpleName();
		this.customerName = customer.getFirstName() + " " + customer.getLastName();
		this.customerSystemReference = customer.getSystemReference();
		this.uniqueIdentifierFieldName = "customerId";
		this.addObserver(customer);
	}
	
	public abstract Report generateReport(int leftMinutes, int leftMessages,double leftMobileData, int leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow);
	
	public abstract void computeDiscount();
	
	public void addObserver(Observer observer) {
		this.accountObserver = observer;
	}
	
	public void removeObserver(Observer observer){
		
	}
	
	public void notifyObservers(){
		this.getObserver().update(new Observable(), this.getBalance());
	}
	
	@Override
	public String getUniqueIdentifierFieldValue(){
		return customerSystemReference;
	}
	
	public Observer getObserver(){
		return this.accountObserver;
	}
	public double getBalance() {
		return balance;
		
	}

	public void setBalance(double balance) {
		this.balance = balance;
		this.notifyObservers();
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
