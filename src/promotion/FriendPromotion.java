package promotion;
/*
 * @author Xiangkai Tang
 */
import account.Account;
import report.Report;

public class FriendPromotion extends Promotion {
	
	
	public FriendPromotion(Account account) {
		super(account);
		account.setDifferentProviderMinutes(100);
	}

	public FriendPromotion() { //get the value from GUI
		super();

	}
	
	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow)
	{
		Report r = super.generateReport(spentMinutes,spentMessages,usedMobileData,leftMinutes,leftMessages,leftMobileData,costUntilNow);
		//r.setDifferentProviderMinutes(differentProviderMinutes);
		PDFcreater pdfc = new PDFcreater(r,account.getCustomer());
		pdfc.outputPDF();
		return r;
	}
	public void computeDiscuont()
	{
		
	}
}
