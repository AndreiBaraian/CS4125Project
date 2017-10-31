package account;
import java.util.ArrayList;
import java.util.List;
import promotion.PDFcreater;

import promotion.Promotion;
import region.Region;
import report.Report;

public class EnterpriseAccount extends Account {
	private String endate;
	private String number;
	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Report generateReport(float spentMinutes, float spentMessages,
			float usedMobileData, float leftMinutes, float leftMessages,
			float leftMobileData, float costUntilNow) {
		Report r = new Report(spentMinutes, spentMessages,usedMobileData, leftMinutes,leftMessages,leftMobileData,costUntilNow); //get value from GUI
		PDFcreater pdf = new PDFcreater(customer,r);
		pdf.outputPDF(customer.name);
		return r;
	}
	public void extendDate(String date)
	{
		
	}

	public EnterpriseAccount(float balance, Region homeregion,Promotion promotion, String endate, String number) {
		super(balance, homeregion,promotion);
		this.endate = endate;
		this.number = number;
	}


	
	
	
}
