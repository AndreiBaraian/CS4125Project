package promotion;
/*
 * @author Xiangkai Tang
 */
import account.Account;
import report.Report;
import region.Region;


public class Promotion extends Account {
	Account account;
	
	private double giftpoints;
	
	
	
	
	
	


	public double getGiftpoints() {
		return giftpoints;
	}

	public void setGiftpoints(double giftpoints) {
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

	

	
	public Report generateReport(int leftMinutes, int leftMessages,double leftMobileData, int leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow) {
		// TODO Auto-generated method stub
		return account.generateReport( leftMinutes,  leftMessages,leftMobileData,leftInternationalMinutes,leftDifferentProviderMinutes,costUntilNow);
	}

	
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}


	
}
