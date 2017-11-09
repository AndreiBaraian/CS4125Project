package promotion;
/*
 * @author Xiangkai Tang
 */
import account.Account;
import report.Report;
import region.Region;


public class Promotion extends Account {
	Account account;
	private double minutes;
	private double duration;
	private double giftpoints;
	private double messages;
	private double differentProviderMinutes;
	private double mobileData;
	private double internationalMinutes;
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

	public double getInternationalMinutes() {
		return internationalMinutes;
	}

	public void setInternationalMinutes(double internationalMinutes) {
		this.internationalMinutes = internationalMinutes;
	}

	public double getMessages() {
		return messages;
	}

	public void setMessages(double messages) {
		this.messages = messages;
	}

	public double getMinutes() {
		return minutes;
	}

	public void setMinutes(double minutes) {
		this.minutes = minutes;
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
		this.account = account;
	}
	
	public Promotion()
	{
		
	}

	

	
	public Report generateReport(double spentMinutes, double spentMessages, double usedMobileData,double usedDifferentProviderMinutes,double usedInternationalMinutes,double leftMinutes, double leftMessages,
			double leftMobileData, double leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow) {
		// TODO Auto-generated method stub
		return account.generateReport( spentMinutes,  spentMessages,
				 usedMobileData,  usedDifferentProviderMinutes,usedInternationalMinutes,leftMinutes,  leftMessages,
				 leftMobileData,leftInternationalMinutes,leftDifferentProviderMinutes,costUntilNow);
	}

	
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}


	
}
