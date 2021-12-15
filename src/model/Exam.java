package model;

public class Exam extends Assessment {

	private int maxMinutes;

	public Exam(String testID, String subDate, Teacher teacher, Course course, int maxMinutes) {
		super(testID, subDate, teacher, course);
		this.maxMinutes = maxMinutes;
	}
	
	public int getMaxMinutes() {
		return this.maxMinutes;
	}

	public void setMaxMinutes(int maxMinutes) {
		this.maxMinutes = maxMinutes;
	}

}