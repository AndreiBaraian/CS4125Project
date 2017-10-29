package promotion;
import report.Report;

public class TravelerPromotion extends Promotion {
	private int internationalMinutes;
	public TravelerPromotion(Account account) {
		super(account);
		this.internationalMinutes = 100;
		// TODO Auto-generated constructor stub
	}
	
	public TravelerPromotion(Account account, int minutes,float duration,int giftpoints,int internationalMinutes) { //get the value from GUI
		super(account);
		this.internationalMinutes = internationalMinutes;
		this.minutes = minutes;
		this.duration = duration;
		this.giftpoints = giftpoints;
	}
	public TravelerPromotion()
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
