package promotion;
/*
 * @author Xiangkai Tang
 */


import report.Report;
import account.*;

public class TravelerPromotion extends Promotion {
	
	public TravelerPromotion(Account account) {
		super(account);
		account.setInternationalMinutes(100);

	}
	
	public TravelerPromotion() { //get the value from GUI
		super();
		
	}

	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow)
	{
		Report r = super.generateReport(spentMinutes,spentMessages,usedMobileData,leftMinutes,leftMessages,leftMobileData,costUntilNow);
		r.setInternationalMinutes(getInternationalMinutes());
		PDFcreater pdfc = new PDFcreater(r,account.getCustomer());
		pdfc.outputPDF();
		return r;
	}
	public void computeDiscount()
	{
		
	}

}
