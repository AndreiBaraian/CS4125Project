package account;

/**
 * @author Andrei Baraian 5% Hibernate annotations
 * @author Xiangkai Tang
 */

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import computeTransaction.CreatedAccount;
import customer.Customer;
import promotion.PDFcreater;
import region.Region;
import report.Report;

@Entity
@Table(name = "tb_familyaccount")
public class FamilyAccount extends Account {
	
	@Transient
	private List<String> numbers;
	
	@Column(name = "numbers")
	private String numbersString;
	
	public FamilyAccount() {}
	
	public FamilyAccount(double balance, Region homeregion, Customer customer,List<String> numbers) {
		super( balance, homeregion, customer);
		this.numbers = numbers;
		this.numbersString = numbersToString(this.numbers);
		this.uniqueIdentifierFieldName = "customerId";
	}

	@Override
	public Report generateReport(int leftMinutes, int leftMessages,double leftMobileData, int leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow) {
		 leftMinutes = 0;
		 leftMessages = 0;
		 leftMobileData = 0;
		 leftInternationalMinutes = 0;
		 leftDifferentProviderMinutes = 0;
		// costUntilNow = spentMinutes*0.1+spentMessages*0.2+usedMobileData*0.5+usedDifferentProviderMinutes*0.8+usedInternationalMinutes;
		Report report = new Report(leftMinutes,leftMessages,leftMobileData,leftInternationalMinutes,leftDifferentProviderMinutes,costUntilNow); 
	    report.setNumbers(numbers);
		PDFcreater pdc = new PDFcreater(report,getCustomer());
		pdc.outputPDF();
	    return report;
	}

	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	public String getNumbersString() {
		return numbersString;
	}

	public void setNumbersString(String numbersString) {
		this.numbersString = numbersString;
	}
	
	public void setUniqueIdentifierFieldName(){
		this.uniqueIdentifierFieldName = "customerId";
	}

	private String numbersToString(List<String> numbers){
		String result = numbers.get(0);
		for(int i = 1; i < numbers.size(); i++)
			result = result + ", " + numbers.get(i);
		return result;
	}

	@Override
	public String toString() {
		return "FamilyAccount [numbers=" + numbers + ", numbersString=" + numbersString + ", customerSystemReference="
				+ customerSystemReference + ", id=" + id + "]";
	}

	
		
}
