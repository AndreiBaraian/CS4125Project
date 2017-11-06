package account;
/*
 * @author Xiangkai Tang
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import customer.Customer;
import region.Region;
import report.Report;



@Entity
@Table(name = "tb_account")
public abstract class Account {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "balance")
	private double balance;
	
	private Region homeRegion;
	
	@Column(name = "homeRegion")
	private String homeRegionString;
	
	private Customer customer;
	
	@Column(name = "customerName")
	private String customerName;

	public Account() {}
	
	public Account(double balance, Region homeRegion,Customer customer) {
		this.customer = customer;
		this.balance = balance;
		this.homeRegion = homeRegion;
		this.homeRegionString = homeRegion.toString();
	}
	
	public abstract Report generateReport(double spentMinutes, double spentMessages, double usedMobileData, double leftMinutes, double leftMessages, double leftMobileData, double costUntilNow);
	
	public abstract void computeDiscount();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
