package promotion;
/*
 * @author Xiangkai Tang
 */
import account.Account;
import report.Report;
import region.Region;


public class Promotion extends Account {
	Account account;
	
	private int giftpoints;
	
	
	

	public int getGiftpoints() {
		return giftpoints;
	}

	public void setGiftpoints(int giftpoints) {
		this.giftpoints = giftpoints;
	}

	public Promotion(Account account) {
		account.setMinutes(500);
		account.setMessages(500);
		this.account = account;
	}
	
	public Promotion()
	{
		
	}

	

	@Override
	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow) {
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
