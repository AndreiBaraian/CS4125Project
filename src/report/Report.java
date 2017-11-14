package report;
/*
 * @author Xiangkai Tang
 */
import java.util.List;


public class Report {
		private String endDate;
		private String number;
		private int numberCount;
		private List<String> numbers;
		private double spentMinutes  ;
		private double spentMessages ;
		private double usedMobileData ;
		private double leftMinutes ;
		private double leftMessages ;
		private double leftMobileData ;
		private double CostUntilNow ;
		private double mobileData;
		private double leftInternationalMinutes;
		private double leftDifferentProviderMinutes;
	public Report(double spentMinutes, double spentMessages, double usedMobileData,double usedDifferentProviderMinutes,double usedInternationalMinutes,double leftMinutes, double leftMessages,
			double leftMobileData, double leftInternationalMinutes,double leftDifferentProviderMinutes,double costUntilNow) {
			super();
			this.spentMinutes = spentMinutes;
			this.spentMessages = spentMessages;
			this.usedMobileData = usedMobileData;
			this.leftMinutes = leftMinutes;
			this.leftMessages = leftMessages;
			this.leftMobileData = leftMobileData;
			this.CostUntilNow = costUntilNow;
			this.leftDifferentProviderMinutes = leftDifferentProviderMinutes;
			this.leftDifferentProviderMinutes = leftDifferentProviderMinutes;
		}
		
		public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endate) {
		this.endDate = endate;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getNumberCount() {
		return numberCount;
	}

	public void setNumberCount(int numberCount) {
		this.numberCount = numberCount;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

		public double getSpentMinutes()
		{
			return spentMinutes;
		}
		public void setSpentMinutes(double spentMinutes)
		{
			this.spentMinutes = spentMinutes;
		}
		public double getSpentMessages()
		{
			return spentMessages;
		}
		public void setSpentMessages(double spentMessages)
		{
			this.spentMessages = spentMessages;
		}
		public double getLeftMinutes()
		{
			return leftMinutes;
		}
		public void setLeftMinutes(double leftMinutes)
		{
			this.leftMinutes = leftMinutes;
		}
		public double getLeftMessages()
		{
			return leftMessages;
		}
		public void setLeftMessages(double leftMessages)
		{
			this.leftMessages = leftMessages;
		}
		public double getLeftMobileData()
		{
			return leftMobileData; 
		}
		public void setLeftMobileData(double leftMobileData)
		{
			this.leftMobileData = leftMobileData;
		}
		public double getMobileData() {
			return mobileData;
		}
		public void setMobileData(double mobileData2) {
			this.mobileData = mobileData2;
		}
		public double getCostUntilNow()
		{
			return CostUntilNow;
		}
		public void setCostUntilNow(double costUntilNow)
		{
			this.CostUntilNow = costUntilNow;
		}
		public double getUsedMobileData()
		{
			return usedMobileData;
		}
		public void setUsedMobileData(double usedMobileData)
		{
			this.usedMobileData = usedMobileData;
		}

		public double getLeftInternationalMinutes() {
			return leftInternationalMinutes;
		}

		public void setLeftInternationalMinutes(double leftInternationalMinutes) {
			this.leftInternationalMinutes = leftInternationalMinutes;
		}

		public double getLeftDifferentProviderMinutes() {
			return leftDifferentProviderMinutes;
		}

		public void setLeftDifferentProviderMinutes(double leftDifferentProviderMinutes) {
			this.leftDifferentProviderMinutes = leftDifferentProviderMinutes;
		}
		
		
}
