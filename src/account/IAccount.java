package account;

import report.Report;

/*
 * @author Xiangkai Tang
 */
public interface IAccount {
    
	public Report generateReport(double spentMinutes, double spentMessages, double usedMobileData, double leftMinutes, double leftMessages, double leftMobileData, double costUntilNow);
	public void computeDiscount();
	
}
