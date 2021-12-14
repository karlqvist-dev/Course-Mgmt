package model;

public class Exam extends Assessment {

	private int maxMinutes;

	public Exam(String testID, String subDate, int maxMinutes) {
		super(testID, subDate);
		this.maxMinutes = maxMinutes;
	}
	
	public int getMaxMinutes() {
		return this.maxMinutes;
	}

	public void setMaxMinutes(int maxMinutes) {
		this.maxMinutes = maxMinutes;
	}

}