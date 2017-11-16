package promotion;
/*
 * @author Xiangkai Tang
 */
import report.Report;
import account.*;


public class SurferPromotion extends Promotion {

	public SurferPromotion(Account account) {
		super(account);
		this.setMobileData(super.getMobileData()+90);
		this.setMinutes(super.getMinutes()+50);
		this.setDuration(super.getDuration()+60); 
		this.setGiftpoints(super.getGiftpoints()+70);
	}
	


	public Report generateReport(int spentMinutes, int spentMessages,
			double usedMobileData,double usedDifferentProviderMinutes,int usedInternationalMinutes)
	{

		int leftMinutes = super.getMinutes() - spentMinutes ;
		int leftMessages = super.getMessages() - spentMessages;
		double leftMobileData = super.getMobileData()-usedMobileData;
		double leftDifferentProviderMinutes = super.getDifferentProviderMinutes()-usedDifferentProviderMinutes;
		int leftInternationalMinutes = super.getInternationalMinutes()-usedInternationalMinutes;
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
		Report r = super.generateReport(leftMinutes,leftMessages,leftMobileData,leftInternationalMinutes,leftDifferentProviderMinutes,costUntilNow);
		PDFcreater pdfc = new PDFcreater(r,account.getCustomer());
		pdfc.outputPDF();
		return r;
	}
	public void computeDiscount()
	{
		
	}
}
