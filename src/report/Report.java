package report;

public class Report {
		private float spentMinutes  ;
		private float spentMessages ;
		private float usedMobileData ;
		private float leftMinutes ;
		private float leftMessages ;
		private float leftMobileData ;
		private float CostUntilNow ;
		private String mobileData;
		private int internationalMinutes;
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
		public Report()
		{
			
		}
		public String getMobileData() {
			return mobileData;
		}
		public void setMobileData(String mobileData) {
			this.mobileData = mobileData;
		}
}
