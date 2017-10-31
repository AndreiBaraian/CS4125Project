package promotion;
import account.*;
import report.Report;
public class FriendPromotion extends Promotion {
	private float differentProviderMinutes;
	
	public FriendPromotion(Account account, Customer customer) {
		super(account);
		this.customer = customer;
	}

	public FriendPromotion(int minutes,float duration,int giftpoints,int differentproviderminutes) { //get the value from GUI
		super();
		// TODO Auto-generated constructor stub
		this.setMinutes(minutes);
		this.setDuration(duration); 
		this.setGiftpoints(giftpoints);
		this.differentProviderMinutes = differentproviderminutes;
		
	}
	
	public Report generateReport(float spentMinutes, float spentMessages,float usedMobileData, float leftMinutes, float leftMessages,float leftMobileData, float costUntilNow)
	{
		Report r = super.generateReport(spentMinutes,spentMessages,usedMobileData,leftMinutes,leftMessages,leftMobileData,costUntilNow);
		r.setDifferentProviderMinutes(differentProviderMinutes);
		PDFcreater pdfc = new PDFcreater(r,customer);
		pdfc.outputPDF();
		return r;
	}
	public void computeDiscuont()
	{
		
	}
}
