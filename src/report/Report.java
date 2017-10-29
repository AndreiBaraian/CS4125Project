package report;

public class Report {
		float spentMinutes = 0 ;
		float spentMessages = 0;
		float usedMobileData = 0;
		float leftMinutes = 0;
		float leftMessages = 0;
		float leftMobileData = 0;
		float CostUntilNow = 0;
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
		public Report(Report r)
		{
			super();
			this.spentMinutes = r.spentMinutes;
			this.spentMessages = r.spentMessages;
			this.usedMobileData = r.usedMobileData;
			this.leftMinutes = r.leftMinutes;
			this.leftMessages = r.leftMessages;
			this.leftMobileData = r.leftMobileData;
			this.CostUntilNow = r.CostUntilNow;
		}
		public Report()
		{
			
		}
}
