package promotion;
/*
 * @author Xiangkai Tang
 */
import report.Report;
import account.*;


public class SurferPromotion extends Promotion {
	
	public SurferPromotion(Account account) {
		super(account);
		super.setMobileData(100);
		
	}
	
	public SurferPromotion(double value) { //get the value from GUI
		super();
		
		
	}

	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow)
	{
		Report r = super.generateReport(spentMinutes,spentMessages,usedMobileData,leftMinutes,leftMessages,leftMobileData,costUntilNow);
		r.setMobileData(getMobileData());
		PDFcreater pdfc = new PDFcreater(r,account.getCustomer());
		pdfc.outputPDF();
		return r;
	}
	public void computeDiscount()
	{
		
	}
}
