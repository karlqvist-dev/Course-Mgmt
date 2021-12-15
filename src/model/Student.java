package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

	//Social Security number, not used as a unique identifier.
	private String ssNbr;
	//Student number, used as a unique identifier.
	private String studentNbr;
	private String name;

	//ArrayList to hold grades
	private ArrayList<Grade> studentGrades = new ArrayList<Grade>();
	//HashMap to hold courses
	private HashMap<String, Course> courses = new HashMap<String, Course>();
	
	public void addGrade(Grade grade) {
		studentGrades.add(grade);
	}
	
	public Grade findGrade(String testID) {
		for(Grade tmpGrade : studentGrades) {
			if(tmpGrade.getStudent().getStudentNbr().equals(studentNbr)) {
				return tmpGrade;
			}
		}
		return null;
	}
	
	public Grade removeGrade(String studentNbr) {
		for(Grade tmpGrade : studentGrades) {
			if(tmpGrade.getStudent().getStudentNbr().equals(studentNbr)) {
				studentGrades.remove(tmpGrade);
				return tmpGrade;
			}
		}
		return null;
	}
	
	public String getSsNbr() {
		return this.ssNbr;
	}

	public void setSsNbr(String ssNbr) {
		this.ssNbr = ssNbr;
	}

	public String getStudentNbr() {
		return this.studentNbr;
	}

	public void setStudentNbr(String studentNbr) {
		this.studentNbr = studentNbr;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Grade> getStudentGrades() {
		return studentGrades;
	}

	public void setStudentGrades(ArrayList<Grade> studentGrades) {
		this.studentGrades = studentGrades;
	}

	public HashMap<String, Course> getCourses() {
		return courses;
	}

	public void setCourses(HashMap<String, Course> courses) {
		this.courses = courses;
	}

	
}