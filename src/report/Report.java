package report;

import java.util.List;

import account.Number;

public class Report {
		private String endate;
		private String number;
		private int numberCount;
		private List<Number> numbers;
		private float spentMinutes  ;
		private float spentMessages ;
		private float usedMobileData ;
		private float leftMinutes ;
		private float leftMessages ;
		private float leftMobileData ;
		private float CostUntilNow ;
		private float mobileData;
		private float internationalMinutes;
		private float differentProviderMinutes;
	public Report(float spentMinutes, float spentMessages,
				float usedMobileData, float leftMinutes, float leftMessages,
				float leftMobileData, float costUntilNow) {
			super();
			this.spentMinutes = spentMinutes;
			this.spentMessages = spentMessages;
			this.usedMobileData = usedMobileData;
			this.leftMinutes = leftMinutes;
			this.leftMessages = leftMessages;
			this.leftMobileData = leftMobileData;
			this.CostUntilNow = costUntilNow;
		}
		
		public String getEndate() {
		return endate;
	}

	public void setEndate(String endate) {
		this.endate = endate;
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

	public List<Number> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Number> numbers) {
		this.numbers = numbers;
	}

		public float getSpentMinutes()
		{
			return spentMinutes;
		}
		public void setSpentMinutes(float spentMinutes)
		{
			this.spentMinutes = spentMinutes;
		}
		public float getSpentMessages()
		{
			return spentMessages;
		}
		public void setSpentMessages(float spentMessages)
		{
			this.spentMessages = spentMessages;
		}
		public float getLeftMinutes()
		{
			return leftMinutes;
		}
		public void setLeftMinutes(float leftMinutes)
		{
			this.leftMinutes = leftMinutes;
		}
		public float getLeftMessages()
		{
			return leftMessages;
		}
		public void setLeftMessages(float leftMessages)
		{
			this.leftMessages = leftMessages;
		}
		public float getLeftMobileData()
		{
			return leftMobileData; 
		}
		public void setLeftMobileData(float leftMobileData)
		{
			this.leftMobileData = leftMobileData;
		}
		public float getMobileData() {
			return mobileData;
		}
		public void setMobileData(float mobileData2) {
			this.mobileData = mobileData2;
		}
		public float getCostUntilNow()
		{
			return CostUntilNow;
		}
		public void setCostUntilNow(float costUntilNow)
		{
			this.CostUntilNow = costUntilNow;
		}
		public float getUsedMobileData()
		{
			return usedMobileData;
		}
		public void setUsedMobileData(float usedMobileData)
		{
			this.usedMobileData = usedMobileData;
		}
		public float getInternationalMinutes()
		{
			return internationalMinutes;
		}
		public void setInternationalMinutes(float internationalMinutes)
		{
			this.internationalMinutes = internationalMinutes;
		}
		public float getDifferentProviderMinutes()
		{
			return differentProviderMinutes;
		}
		public void setDifferentProviderMinutes(float differentProviderMinutes)
		{
			this.differentProviderMinutes = differentProviderMinutes;
		}
		
}
