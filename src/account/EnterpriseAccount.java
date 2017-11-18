package account;
/**
 * @author Andrei Baraian 5% Hibernate annotations
 * @author Xiangkai Tang
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import customer.Customer;
import promotion.PDFcreater;
import region.Region;
import report.Report;

@Entity
@Table(name = "tb_enterpriseaccount")
public class EnterpriseAccount extends Account {
	
	@Column(name = "endDate")
	protected String endDate;
	
	@Column(name = "number")
	protected String number;
	
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
	public Report generateReport(int spentMinutes, int spentMessages, double usedMobileData,double usedDifferentProviderMinutes,int usedInternationalMinutes,int leftMinutes, int leftMessages,
			double leftMobileData, int leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow) {
		 leftMinutes = 0;
		 leftMessages = 0;
		 leftMobileData = 0;
		 leftInternationalMinutes = 0;
		 leftDifferentProviderMinutes = 0;
		 costUntilNow = spentMinutes*0.1+spentMessages*0.2+usedMobileData*0.5+usedDifferentProviderMinutes*0.8+usedInternationalMinutes;
		Report report = new Report(spentMinutes,spentMessages,usedMobileData,usedDifferentProviderMinutes,usedInternationalMinutes,leftMinutes,leftMessages,leftMobileData,leftInternationalMinutes,leftDifferentProviderMinutes,costUntilNow); //get value from GUI
		report.setNumber(number);
		report.setEndDate(endDate);
		PDFcreater pdf = new PDFcreater(report,this.getCustomer());
		pdf.outputPDF();
		return report;
	}
	
	public void extendDate(String date) {}
	
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getReferenceNumber(){
		return customerSystemReference;
	}


	@Override
	public String toString() {
		return "EnterpriseAccount [endDate=" + endDate + ", number=" + number + ", customerSystemReference="
				+ customerSystemReference + ", id=" + id + ", uniqueIdentifierFieldName=" + uniqueIdentifierFieldName
				+ "]";
	}
	
}
