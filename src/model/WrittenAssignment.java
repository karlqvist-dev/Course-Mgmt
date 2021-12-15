package model;

public class WrittenAssignment extends Assessment {

	private String dueDate;
	
	public WrittenAssignment(String testID, String subDate, Teacher teacher, Course course, String dueDate) {
		super(testID, subDate, teacher, course);
		this.dueDate = dueDate;
	}

	public String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

}