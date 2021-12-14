package model;

import java.util.ArrayList;

public abstract class Assessment {

	// Date of submission
	private String subDate;
	private String testID;
	
	//ArrayList to hold grades
	private ArrayList<Grade> assessmentGrades = new ArrayList<Grade>();

	public Assessment(String testID, String subDate) {
		this.testID = testID;
		this.subDate = subDate;
	}
	
	
	public void addGrade(Grade grade) {
		assessmentGrades.add(grade);
	}
	
	public Grade findGrade(String studentNbr) {
		for(Grade tmpGrade : assessmentGrades) {
			if(tmpGrade.getStudent().getStudentNbr().equals(studentNbr)) {
				return tmpGrade;
			}
		}
		return null;
	}
	
	public Grade removeGrade(String studentNbr) {
		for(Grade tmpGrade : assessmentGrades) {
			if(tmpGrade.getStudent().getStudentNbr().equals(studentNbr)) {
				assessmentGrades.remove(tmpGrade);
				return tmpGrade;
			}
		}
		return null;
	}
	
	public String getSubDate() {
		return this.subDate;
	}

	public void setSubDate(String subDate) {
		this.subDate = subDate;
	}

	public String getTestId() {
		return this.testID;
	}

	public void setTestId(String testId) {
		this.testID = testId;
	}

	public ArrayList<Grade> getAssessmentGrades() {
		return assessmentGrades;
	}

	public void setAssessmentGrades(ArrayList<Grade> assessmentGrades) {
		this.assessmentGrades = assessmentGrades;
	}

}