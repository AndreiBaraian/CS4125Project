package account;

/*
 * @author Xiangkai Tang
 */

import report.Report;

public interface IAccount {
    
	/*
	 * Generate the report of the information of the account
	 * @pre spentMinutes != null && spentMinutes >= 0
	 * @pre spentMessages != null && sentMessages >= 0
	 * @pre usedMobileData != null && spentMobileData >= 0
	 * @pre usedDifferentProviderMinutes != null && usedDifferentProviderMinutes >= 0
	 * @pre usedInternationalMinutes != null && usedInternationalMinutes >= 0
	 * @post leftMinutes != null && leftMinutes >= 0
	 * @post leftMessages != null && leftMessages >= 0
	 * @post leftMobileData != null && leftMobileData >= 0
	 * @post leftInternationalMinutes != null && leftInternationalMinutes >= 0
	 * @post leftDifferentProviderMinutes != null && leftDifferentProviderMinutes >= 0
	 * @post costUntilNow != null && costUntilNow >= 0
	 * @post @result != null
	 */
	public Report generateReport(int leftMinutes, int leftMessages,double leftMobileData, int leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow);
	
	/*
	 * Compute discount for the account
	 * @pre true
	 * @post @nochange
	 */
	public void computeDiscount();
	
}
