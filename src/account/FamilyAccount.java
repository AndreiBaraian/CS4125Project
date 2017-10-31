package account;
import java.util.List;

import promotion.*;
import region.Region;
import report.Report;

public class FamilyAccount extends Account {
	private int numberCount;
	private List<Number> numbers;
	

	@Override
	public Report generateReport(float spentMinutes, float spentMessages,
			float usedMobileData, float leftMinutes, float leftMessages,
			float leftMobileData, float costUntilNow) {
		// TODO Auto-generated method stub
		Report r = new Report(spentMinutes, spentMessages,usedMobileData, leftMinutes,leftMessages,leftMobileData,costUntilNow);  //get value from GUI
	    r.setNumberCount(numberCount);
	    r.setNumbers(numbers);
		PDFcreater pdc = new PDFcreater(r,customer);
		pdc.outputPDF();
	    return r;
	}

	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}

	public FamilyAccount(float balance, Region homeregion, Customer customer,
			Promotion promotion, int numberCount, List<Number> numbers) {
		super(balance, homeregion, promotion,customer);
		this.numberCount = numberCount;
		this.numbers = numbers;
	}
	
		
}
