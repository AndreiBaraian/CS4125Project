package promotion;
import report.Report;

public class SurferPromotion extends Promotion {
	private String mobileData;
	public SurferPromotion(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}
	
	public SurferPromotion(Account account, int minutes,float duration,int giftpoints,String mobileData) { //get the value from GUI
		super(account);
		this.mobileData = mobileData;
		this.minutes = minutes;
		this.duration = duration;
		this.giftpoints = giftpoints;
	}
	public SurferPromotion()
	{
		
	}

	public Report generateReport()
	{
		return new Report(super.generateReport());
	}
	public void computeDiscount()
	{
		
	}
}
