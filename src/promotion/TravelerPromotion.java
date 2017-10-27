package promotion;
import report.Report;

public class TravelerPromotion extends Promotion {
	private int internationalMinutes;
	public TravelerPromotion(Account p) {
		super(p);
		this.internationalMinutes = 100;
		// TODO Auto-generated constructor stub
	}
	public Report generateReport()
	{
		return null;
	}
	public void computeDiscount()
	{
		
	}

}
