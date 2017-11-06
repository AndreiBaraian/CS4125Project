package promotion;
import customer.Customer;
import account.*;
import report.Report;
/*
 * @author Xiangkai Tang
 */
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
	
	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow)
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
