package promotion;
import region.Region;
import report.Report;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
	protected float balance;
	protected Region homeregion;
	protected String customer;
	//protected List<Promotion> promotions;
	protected Promotion promotion;
	public abstract Report generateReport();
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
