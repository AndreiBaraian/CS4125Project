package promotion;
import report.Report;
import region.Region;

public class Promotion extends Account {
	Account account;
	int minutes;
	float duration;
	int giftpoints;
	public Promotion(Account account) {
		this.account = account;
	}

	@Override
	public Report generateReport(String customer) {
		// TODO Auto-generated method stub
		return account.generateReport(customer);
	}

	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}
	
}
