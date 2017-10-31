package promotion;
import account.Account;
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

	public Report generateReport(float spentMinutes, float spentMessages,
			float usedMobileData, float leftMinutes, float leftMessages,
			float leftMobileData, float costUntilNow)
	{
		Report r = super.generateReport(spentMinutes,spentMessages,usedMobileData,leftMinutes,leftMessages,leftMobileData,costUntilNow);
		r
		return ;
	}
	public void computeDiscount()
	{
		
	}
}
