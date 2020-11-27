package in.nit.model;

public class Si {
	
	private String start_DT;
	private String end_DT;
	public String getStart_DT() {
		return start_DT;
	}
	public void setStart_DT(String start_DT) {
		this.start_DT = start_DT;
	}
	public String getEnd_DT() {
		return end_DT;
	}
	public void setEnd_DT(String end_DT) {
		this.end_DT = end_DT;
	}
	
	private float Year;

	 public float getYear() {
		return Year;
	}
	public void setYear(float year) {
		Year = year;
	}

	private long principal_AMOUNT; 
	 public long getPrincipal_AMOUNT() {
		return principal_AMOUNT;
	}
	public void setPrincipal_AMOUNT(long principal_AMOUNT) {
		this.principal_AMOUNT = principal_AMOUNT;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	private Integer rate;
	 

}
