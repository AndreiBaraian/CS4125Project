package account;
import region.Region;
import report.Report;
import customer.Customer;


public abstract class Account {
	private double balance;
	private Region homeregion;
	private Customer customer;
	//protected List<Promotion> promotions;
	
public Account(double balance, Region homeregion,Customer customer) {
		
		this.setCustomer(customer);
		this.setBalance(balance);
		this.setHomeregion(homeregion);
		
	}
	public Account()
	{
		
	}
	
	public abstract Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow);
	public abstract void computeDiscount();
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Region getHomeregion() {
		return homeregion;
	}
	public void setHomeregion(Region homeregion) {
		this.homeregion = homeregion;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
