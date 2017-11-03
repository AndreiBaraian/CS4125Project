package promotion;
import account.Account;
import report.Report;

public class TravelerPromotion extends Promotion {
	private int internationalMinutes;
	public TravelerPromotion(Account account) {
		super(account);
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

	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow)
	{
		Report r = super.generateReport(spentMinutes,spentMessages,usedMobileData,leftMinutes,leftMessages,leftMobileData,costUntilNow);
		r.setInternationalMinutes(internationalMinutes);
		PDFcreater pdfc = new PDFcreater(r,account.getCustomer());
		pdfc.outputPDF();
		return r;
	}
	public void computeDiscount()
	{
		
	}

}
