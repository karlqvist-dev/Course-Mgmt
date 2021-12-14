package model;

public class Grade {

	private int gradeVal;
	
	private Assessment assessment;
	private Student student;
	
	public Grade(Assessment assessment, Student student, int gradeVal) {
		this.assessment = assessment;
		this.student = student;
		this.gradeVal = gradeVal;
	}
	
	public int getGradeVal() {
		return this.gradeVal;
	}

	public void setGradeVal(int gradeVal) {
		this.gradeVal = gradeVal;
	}

	public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


}