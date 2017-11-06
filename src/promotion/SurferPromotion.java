package promotion;
import customer.Customer;
import account.Account;
import report.Report;
import account.*;
/*
 * @author Xiangkai Tang
 */
public class SurferPromotion extends Promotion {
	private double mobileData;
	public SurferPromotion(Account account,Customer customer) {
		super(account);
		this.customer = customer;
		// TODO Auto-generated constructor stub
	}
	
	public SurferPromotion(int minutes,float duration,int giftpoints,float mobileData) { //get the value from GUI
		super();
		this.mobileData = mobileData;
		this.setMinutes(minutes);
		this.setDuration(duration); 
		this.setGiftpoints(giftpoints);
		
	}

	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow)
	{
		Report r = super.generateReport(spentMinutes,spentMessages,usedMobileData,leftMinutes,leftMessages,leftMobileData,costUntilNow);
		r.setMobileData(mobileData);
		PDFcreater pdfc = new PDFcreater(r,customer);
		pdfc.outputPDF();
		return r;
	}
	public void computeDiscount()
	{
		
	}
}
