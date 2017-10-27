package promotion;
import report.Report;
import region.Region;

public class Promotion extends Account {
	Account p;
	
	public Promotion(Account p) {
		this.p = p;
	}

	@Override
	public Report generateReport() {
		// TODO Auto-generated method stub
		return p.generateReport();
	}

	@Override
	public void computeDiscount() {
		// TODO Auto-generated method stub
		
	}
	
}
