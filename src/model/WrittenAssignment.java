package model;

public class WrittenAssignment extends Assessment {

	private String dueDate;
	
	public WrittenAssignment(String testID, String subDate, String dueDate) {
		super(testID, subDate);
		this.dueDate = dueDate;
	}

	public String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

}