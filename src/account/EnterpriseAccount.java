package account;
import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import promotion.PDFcreater;
import promotion.Promotion;
import region.Region;
import report.Report;

/*
 * @author Xiangkai Tang
 */
public class EnterpriseAccount extends Account {
	private String endate;
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
		report.setEndate(endate);
		PDFcreater pdf = new PDFcreater(report,this.customer);
		pdf.outputPDF();
		return report;
	}
	public void extendDate(String date)
	{
		
	}

	public EnterpriseAccount(double balance, Region homeregion,Promotion promotion,Customer customer, String endate, String number) {
		super(balance, homeregion,promotion,customer);
		this.endate = endate;
		this.number = number;
		this.customer = customer;
	}


	
	
	
}
