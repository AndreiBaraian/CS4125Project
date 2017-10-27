package promotion;
import region.Region;
import report.Report;

public abstract class Account {
	private float balance;
	private Region homeregion;
	public abstract Report generateReport();
	public abstract void computeDiscount();
}
