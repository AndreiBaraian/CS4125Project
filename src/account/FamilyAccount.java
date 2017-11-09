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
	
	public FamilyAccount(double balance, Region homeregion, Customer customer,  List<String> numbers) {
		super(balance, homeregion, customer);
		this.numbers = numbers;
		this.numbersString = numbersToString(numbers);
		this.uniqueIdentifierFieldName = "customerId";
	}

	@Override
	public Report generateReport(double spentMinutes, double spentMessages, double usedMobileData,double usedDifferentProviderMinutes,double usedInternationalMinutes,double leftMinutes, double leftMessages,
			double leftMobileData, double leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow) {
		// TODO Auto-generated method stub
		 leftMinutes = 0;
		 leftMessages = 0;
		 leftMobileData = 0;
		 leftInternationalMinutes = 0;
		 leftDifferentProviderMinutes = 0;
		 costUntilNow = spentMinutes*0.1+spentMessages*0.2+usedMobileData*0.5+usedDifferentProviderMinutes*0.8+usedInternationalMinutes;
		Report r = new Report(spentMinutes,spentMessages,usedMobileData,usedDifferentProviderMinutes,usedInternationalMinutes,leftMinutes,leftMessages,leftMobileData,leftInternationalMinutes,leftDifferentProviderMinutes,costUntilNow); 
	    r.setNumbers(numbers);
		PDFcreater pdc = new PDFcreater(r,getCustomer());
		pdc.outputPDF();
	    return r;
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
		
}
