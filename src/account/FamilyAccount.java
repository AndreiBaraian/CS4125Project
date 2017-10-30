package account;
import java.util.List;

import promotion.Promotion;
import region.Region;
import report.Report;

public class FamilyAccount extends Account {
	private int numberCount;
	private List<Number> numbers;
	

	@Override
	public Report generateReport() {
		// TODO Auto-generated method stub
		Report r = new Report();  //get value from GUI
		return r;
	}

	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}

	public FamilyAccount(float balance, Region homeregion, String customer,
			Promotion promotion, int numberCount, List<Number> numbers) {
		super(balance, homeregion, promotion);
		this.numberCount = numberCount;
		this.numbers = numbers;
	}
	
		
}
