package promotion;
import account.Account;
import report.Report;
import region.Region;

public class Promotion extends Account {
	Account account;
	protected int minutes;
	protected float duration;
	protected int giftpoints;
	public Promotion(Account account) {
		this.account = account;
	}
	


	@Override
	public Report generateReport(float spentMinutes, float spentMessages,
			float usedMobileData, float leftMinutes, float leftMessages,
			float leftMobileData, float costUntilNow) {
		// TODO Auto-generated method stub
		return account.generateReport( spentMinutes,  spentMessages,
				 usedMobileData,  leftMinutes,  leftMessages,
				 leftMobileData,costUntilNow);
	}

	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}


	
}
