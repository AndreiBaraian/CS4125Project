package account;
import region.Region;
import report.Report;

import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import promotion.Promotion;

public abstract class Account {
	protected double balance;
	protected Region homeregion;
	protected Customer customer;
	//protected List<Promotion> promotions;
	protected Promotion promotion;
	public abstract Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow);
	public abstract void computeDiscount();
	
	public Account(double balance, Region homeregion,Promotion promotion,Customer customer) {
		super();
		this.customer = customer;
		this.balance = balance;
		this.homeregion = homeregion;
		this.promotion = promotion;
	}
	public Account()
	{
		
	}
	
}
