package promotion;
import account.Account;
import report.Report;
import region.Region;

public class Promotion extends Account {
	Account account;
	protected int minutes;
	protected float duration;
	protected int giftpoints;
	public Promotion(Account account) {
		this.account = account;
	}
	
	public Promotion()
	{
		
	}


	@Override
	public Report generateReport() {
		// TODO Auto-generated method stub
		return account.generateReport();
	}

	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}


	
}
