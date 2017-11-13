package promotion;
/*
 * @author Xiangkai Tang
 */
import account.Account;
import report.Report;
import region.Region;


public class Promotion extends Account {
	Account account;
	private int minutes;
	private double duration;
	private double giftpoints;
	private int messages;
	private double differentProviderMinutes;
	private double mobileData;
	private int internationalMinutes;
	private double costUntilNow;
	
	
	
	
	
	public double getCostUntilNow() {
		return costUntilNow;
	}

	public void setCostUntilNow(double costUntilNow) {
		this.costUntilNow = costUntilNow;
	}

	public double getDifferentProviderMinutes() {
		return differentProviderMinutes;
	}

	public void setDifferentProviderMinutes(double differentProviderMinutes) {
		this.differentProviderMinutes = differentProviderMinutes;
	}

	public double getMobileData() {
		return mobileData;
	}

	public void setMobileData(double mobileData) {
		this.mobileData = mobileData;
	}


	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int leftMinutes) {
		this.minutes = leftMinutes;
	}

	public int getMessages() {
		return messages;
	}

	public void setMessages(int messages) {
		this.messages = messages;
	}

	public int getInternationalMinutes() {
		return internationalMinutes;
	}

	public void setInternationalMinutes(int internationalMinutes) {
		this.internationalMinutes = internationalMinutes;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}


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

	

	
	public Report generateReport(int spentMinutes, int spentMessages, double usedMobileData,double usedDifferentProviderMinutes,int usedInternationalMinutes,int leftMinutes, int leftMessages,
			double leftMobileData, int leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow) {
		// TODO Auto-generated method stub
		return account.generateReport( spentMinutes,  spentMessages,
				 usedMobileData,  usedDifferentProviderMinutes,usedInternationalMinutes,leftMinutes,  leftMessages,
				 leftMobileData,leftInternationalMinutes,leftDifferentProviderMinutes,costUntilNow);
	}

	
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}


	
}
