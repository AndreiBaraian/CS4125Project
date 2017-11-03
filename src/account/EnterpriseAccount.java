package account;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import customer.Customer;
import promotion.PDFcreater;
import region.Region;
import report.Report;

@Entity
@Table(name = "tb_enterpriseAccount")
public class EnterpriseAccount extends Account {
	
	@Column(name = "endDate")
	private String endDate;
	
	@Column(name = "number")
	private String number;
	
	public EnterpriseAccount() {}
	
	public EnterpriseAccount(double balance, Region homeregion,Customer customer, String endDate, String number) {
		super(balance, homeregion,customer);
		this.endDate = endDate;
		this.number = number;
		this.setCustomer(customer);
	}
	
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
	
	public void extendDate(String date) {}
	
}
