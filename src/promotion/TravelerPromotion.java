package promotion;
import account.Account;
import report.Report;
import account.*;

public class TravelerPromotion extends Promotion {
	private int internationalMinutes;
	public TravelerPromotion(Account account,Customer customer) {
		super(account);
		this.customer = customer;
		this.internationalMinutes = 100;
		// TODO Auto-generated constructor stub
	}
	
	public TravelerPromotion(int minutes,float duration,int giftpoints,int internationalMinutes) { //get the value from GUI
		super();
		this.internationalMinutes = internationalMinutes;
		this.setMinutes(minutes);
		this.setDuration(duration);
		this.setGiftpoints(giftpoints);
	}

	public Report generateReport(float spentMinutes, float spentMessages,float usedMobileData, float leftMinutes, float leftMessages,float leftMobileData, float costUntilNow)
	{
		Report r = super.generateReport(spentMinutes,spentMessages,usedMobileData,leftMinutes,leftMessages,leftMobileData,costUntilNow);
		r.setInternationalMinutes(internationalMinutes);
		PDFcreater pdfc = new PDFcreater(r,customer);
		pdfc.outputPDF();
		return r;
	}
	public void computeDiscount()
	{
		
	}

}
