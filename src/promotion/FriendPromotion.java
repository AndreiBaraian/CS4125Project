package promotion;
import account.Account;
import report.Report;
public class FriendPromotion extends Promotion {
	private int differentProviderMinutes;
	
	public FriendPromotion(Account account, int differentProviderMinutes) {
		super(account);
		this.differentProviderMinutes = differentProviderMinutes;
	}

	public FriendPromotion(Account account, int minutes,float duration,int giftpoints,int differentproviderminutes) { //get the value from GUI
		super(account);
		// TODO Auto-generated constructor stub
		this.minutes = minutes;
		this.duration = duration;
		this.giftpoints = giftpoints;
		this.differentProviderMinutes = differentproviderminutes;
	}
	public FriendPromotion()
	{
		
	}
	
	public Report generateReport()
	{
		return new Report(super.generateReport());
	}
	public void computeDiscuont()
	{
		
	}
}
