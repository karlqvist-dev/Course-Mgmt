package model;

public class Exam extends Assessment {

	private int maxMinutes;

	public Exam(String date, Course course, Teacher teacher, int maxMinutes) {
		super(date, course, teacher);
		this.maxMinutes = maxMinutes;
	}
	
	public int getMaxMinutes() {
		return this.maxMinutes;
	}

	public void setMaxMinutes(int maxMinutes) {
		this.maxMinutes = maxMinutes;
	}

}