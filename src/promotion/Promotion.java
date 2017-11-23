package promotion;

/*
 * @author Xiangkai Tang
 */

import account.Account;
import report.Report;

public class Promotion extends Account {
	
	protected Account account;
	
	private double giftpoints;
	
	public Promotion(Account account) {
		account.setMinutes(500);
		account.setMessages(500);
		this.account = account;
	}
	
	public Promotion() {}

	public Account getAccount() {
		return account;
	}

	public double getGiftpoints() {
		return giftpoints;
	}

	public void setGiftpoints(double giftpoints) {
		this.giftpoints = giftpoints;
	}

	public Report generateReport(int leftMinutes, int leftMessages,double leftMobileData, int leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow) {
		// TODO Auto-generated method stub
		return account.generateReport( leftMinutes,  leftMessages,leftMobileData,leftInternationalMinutes,leftDifferentProviderMinutes,costUntilNow);
	}

	public void computeDiscount() {
		// TODO Auto-generated method stub	
	}	
}
