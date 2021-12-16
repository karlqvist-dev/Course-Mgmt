package model;

import java.util.ArrayList;

public abstract class Assessment {

	private String date; // Deadline
	private String testID;
	
	private Teacher teacher;
	private Course course;
	
	private ArrayList<Grade> assessmentGrades = new ArrayList<Grade>(); //ArrayList to hold grades
	
	private static int testIDCount = 100;
	
	public Assessment(String date, Course course, Teacher teacher) {
		this.date = date;
		this.teacher = teacher;
		this.course = course;
		this.testID = Assessment.generateTestID();
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
	
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
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
	
	public static int getTestIDCount() {
		return testIDCount;
	}


	public static void setTestIDCount(int testIDCount) {
		Assessment.testIDCount = testIDCount;
	}
	//This method generates a test ID for the assessment using the testIDCount variable
	public static String generateTestID() {
		if(testIDCount <= 999) {
			String strTmp = "T" + testIDCount;
			testIDCount++;
			return strTmp;
		}
		return null;
	}

}