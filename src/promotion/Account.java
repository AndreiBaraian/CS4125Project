package promotion;
import region.Region;
import report.Report;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
	private float balance;
	private Region homeregion;
	private List<Promotion> promotions = new ArrayList();
	public abstract Report generateReport();
	public abstract void computeDiscount();
}
