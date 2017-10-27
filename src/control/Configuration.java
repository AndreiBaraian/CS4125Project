package control;


public class Configuration {
	private String type;
	private int minDuration;
	private int maxDuration;
	private String from;
	private String to;
	private int quantity;

	public Configuration(String type,String from, String to,String minDuration, String maxDuration,String quantity)
	{
		this.type=type;
		this.from=from;
		this.to=to;
		this.minDuration= Integer.parseInt(minDuration);
		this.maxDuration= Integer.parseInt(maxDuration);
		this.quantity= Integer.parseInt(quantity);
		
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMinDuration() {
		return minDuration;
	}
	public void setMinDuration(int minDuration) {
		this.minDuration = minDuration;
	}
	public int getMaxDuration() {
		return maxDuration;
	}
	public void setMaxDuration(int maxDuration) {
		this.maxDuration = maxDuration;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
