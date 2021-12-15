package model;

import java.util.ArrayList;

public abstract class Assessment {

	// Date of submission
	private String subDate;
	private String testID;
	
	private Teacher teacher;
	private Course course;
	
	//ArrayList to hold grades
	private ArrayList<Grade> assessmentGrades = new ArrayList<Grade>();

	public Assessment(String testID, String subDate, Teacher teacher, Course course) {
		this.testID = testID;
		this.subDate = subDate;
		this.teacher = teacher;
		this.course = course;
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


	public String getTestID() {
		return testID;
	}


	public void setTestID(String testID) {
		this.testID = testID;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}

}