package account;
/*
 * @author Xiangkai Tang
 */

import customer.Customer;
import promotion.PDFcreater;
import promotion.Promotion;
import region.Region;
import report.Report;


public class EnterpriseAccount extends Account {
	private String endDate;
	private String number;
	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow) {
		Report report = new Report(spentMinutes, spentMessages,usedMobileData, leftMinutes,leftMessages,leftMobileData,costUntilNow); //get value from GUI
		report.setNumber(number);
		report.setEndDate(endDate);
		PDFcreater pdf = new PDFcreater(report,this.getCustomer());
		pdf.outputPDF();
		return report;
	}
	public void extendDate(String date)
	{
		
	}

	public EnterpriseAccount(double balance, Region homeregion,Customer customer, String endDate, String number) {
		super(balance, homeregion,customer);
		this.endDate = endDate;
		this.number = number;
		this.setCustomer(customer);
	}


	
	
	
}
