package account;

/*
 * @author Andrei Baraian 5% Hibernate annotations
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
	public Report generateReport(double spentMinutes, double spentMessages, double usedMobileData, double leftMinutes, double leftMessages, double leftMobileData, double costUntilNow) {
		// TODO Auto-generated method stub
		Report r = new Report(spentMinutes, spentMessages,usedMobileData, leftMinutes,leftMessages,leftMobileData,costUntilNow);  //get value from GUI
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
