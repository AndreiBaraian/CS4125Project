package account;
import region.Region;
import report.Report;

import java.util.ArrayList;
import java.util.List;

import promotion.Promotion;

public abstract class Account {
	protected float balance;
	protected Region homeregion;
	protected Customer customer;
	//protected List<Promotion> promotions;
	protected Promotion promotion;
	public abstract Report generateReport(float spentMinutes, float spentMessages,
			float usedMobileData, float leftMinutes, float leftMessages,
			float leftMobileData, float costUntilNow);
	public abstract void computeDiscount();
	
	public Account(float balance, Region homeregion,Promotion promotion) {
		super();
		this.balance = balance;
		this.homeregion = homeregion;
		this.promotion = promotion;
	}
	public Account()
	{
		
	}
	
}
