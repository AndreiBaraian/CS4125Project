package account;
/*
 * @author Xiangkai Tang
 */

import report.Report;


public interface IAccount {
    
	public Report generateReport(double spentMinutes, double spentMessages, double usedMobileData,double usedDifferentProviderMinutes,double usedInternationalMinutes);
	public void computeDiscount();
	
}
