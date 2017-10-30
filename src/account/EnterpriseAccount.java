package account;
import java.util.ArrayList;
import java.util.List;

import promotion.Promotion;
import region.Region;
import report.Report;

public class EnterpriseAccount extends Account {
	private String endate;
	private String number;
	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Report generateReport() {
		Report r = new Report(); //get value from GUI
		return r;
	}
	public void extendDate(String date)
	{
		
	}

	public EnterpriseAccount(float balance, Region homeregion,Promotion promotion, String endate, String number) {
		super(balance, homeregion,promotion);
		this.endate = endate;
		this.number = number;
	}


	
	
	
}
