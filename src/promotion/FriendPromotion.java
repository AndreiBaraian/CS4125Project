package promotion;
/*
 * @author Xiangkai Tang
 */
import account.Account;
import report.Report;

public class FriendPromotion extends Promotion {
	
	public FriendPromotion(Account account) {
		super(account);
		this.setMinutes(super.getMinutes()+100);
		this.setDuration(super.getDuration()+200); 
		this.setGiftpoints(super.getGiftpoints()+300);
		this.setDifferentProviderMinutes(super.getDifferentProviderMinutes()+200); 
	}

	
	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData,double usedDifferentProviderMinutes,double usedInternationalMinutes)
	{
		double leftMinutes = super.getMinutes() - spentMinutes ;
		double leftMessages = super.getMessages() - spentMessages;
		double leftMobileData = super.getMobileData()-usedMobileData;
		double leftDifferentProviderMinutes = super.getDifferentProviderMinutes()-usedDifferentProviderMinutes;
		double leftInternationalMinutes = super.getInternationalMinutes()-usedInternationalMinutes;
		double costUntilNow = spentMinutes*0.1+spentMessages*0.2+usedMobileData*0.5;
		if(leftMinutes<0)
		{
			leftMinutes = 0;
			this.setMinutes(leftMinutes);
		}
		else
		{
			this.setMinutes(leftMinutes);
		}
		if(leftMessages<0)
		{
			leftMessages = 0;
			this.setMessages(leftMessages);
		}
		else
		{
			this.setMessages(leftMessages);
		}
		if(leftMobileData<0)
		{
			leftMobileData = 0;
			this.setMobileData(leftMobileData);
		}
		else
		{
			this.setMobileData(leftMobileData);
		}
		if(leftDifferentProviderMinutes<0)
		{
			leftDifferentProviderMinutes = 0;
			this.setDifferentProviderMinutes(leftDifferentProviderMinutes);
		}
		else
		{
			this.setDifferentProviderMinutes(leftDifferentProviderMinutes);
		}
		if(leftInternationalMinutes<0)
		{
			leftInternationalMinutes = 0;
			this.setInternationalMinutes(leftInternationalMinutes);
		}
		else
		{
			this.setInternationalMinutes(leftInternationalMinutes);
		}
		Report r = super.generateReport(spentMinutes,spentMessages,usedMobileData,usedDifferentProviderMinutes,usedInternationalMinutes,leftMinutes,leftMessages,leftMobileData,leftInternationalMinutes,leftDifferentProviderMinutes,costUntilNow);
		PDFcreater pdfc = new PDFcreater(r,account.getCustomer());
		pdfc.outputPDF();
		return r;
	}
	public void computeDiscount()
	{
	   
	}
}
