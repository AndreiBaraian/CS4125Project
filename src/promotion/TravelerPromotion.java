package promotion;
/*
 * @author Xiangkai Tang
 */


import report.Report;
import account.*;

public class TravelerPromotion extends Promotion {
	private int internationalMinutes;
	public TravelerPromotion(Account account) {
		super(account);
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
