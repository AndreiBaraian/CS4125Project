package account;
/*
 * @author Xiangkai Tang
 */
import java.util.List;

import customer.Customer;
import promotion.*;
import region.Region;
import report.Report;


public class FamilyAccount extends Account {
	private int numberCount;
	private List<String> numbers;
	

	@Override
	public Report generateReport(double spentMinutes, double spentMessages,
			double usedMobileData, double leftMinutes, double leftMessages,
			double leftMobileData, double costUntilNow) {
		// TODO Auto-generated method stub
		Report r = new Report(spentMinutes, spentMessages,usedMobileData, leftMinutes,leftMessages,leftMobileData,costUntilNow);  //get value from GUI
	    r.setNumberCount(numberCount);
	    r.setNumbers(numbers);
		PDFcreater pdc = new PDFcreater(r,getCustomer());
		pdc.outputPDF();
	    return r;
	}

	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}

	public FamilyAccount(double balance, Region homeregion, Customer customer,  List<String> numbers) {
		super(balance, homeregion, customer);
		this.numbers = numbers;
	}
	
		
}
