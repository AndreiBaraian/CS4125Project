package promotion;
import account.Account;
import report.Report;

public class Promotion extends Account {
	Account account;
	private int minutes;
	private double duration;
	private int giftpoints;
	private int messages;
	
	public int getMessages() {
		return messages;
	}

	public void setMessages(int messages) {
		this.messages = messages;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getGiftpoints() {
		return giftpoints;
	}

	public void setGiftpoints(int giftpoints) {
		this.giftpoints = giftpoints;
	}

	public Promotion(Account account) {
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
