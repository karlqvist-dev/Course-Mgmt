package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

	private String ssNbr; //Social Security number, not used as a unique identifier.
	private String name;
	private String studentNbr; //Student number, used as a unique identifier.

	//ArrayList to hold grades
	private ArrayList<Grade> studentGrades = new ArrayList<Grade>();
	//HashMap to hold courses
	private HashMap<String, Course> courses = new HashMap<String, Course>();
	
	private static int studNbrCount = 8000;
	
	public Student(String ssNbr, String name) {
		this.ssNbr = ssNbr;
		this.name = name;
		this.studentNbr = Student.generateStudNbr();
	}
	
	//Method to add a grade to the ArrayList
	public void addGrade(Grade grade) {
		studentGrades.add(grade);
	}
	//Method to find a grade in the ArrayList
	public Grade findGrade(String testID) {
		for(Grade tmpGrade : studentGrades) {
			if(tmpGrade.getStudent().getStudentNbr().equals(studentNbr)) {
				return tmpGrade;
			}
		}
		return null;
	}
	//Method to remove a grade from the ArrayList
	public Grade removeGrade(String studentNbr) {
		for(Grade tmpGrade : studentGrades) {
			if(tmpGrade.getStudent().getStudentNbr().equals(studentNbr)) {
				studentGrades.remove(tmpGrade);
				return tmpGrade;
			}
		}
		return null;
	}
	
	
	public void addCourse(String courseID, Course course) {
		courses.put(courseID, course);
	}
	public Course getCourse(String courseID) {
		return courses.get(courseID);
	}
	public Course removeCourse(String courseID) {
		return courses.remove(courseID);
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
	public static int getStudNbrCount() {
		return studNbrCount;
	}
	public static void setStudNbrCount(int studNbrCount) {
		Student.studNbrCount = studNbrCount;
	}
	//this method generates a studentNbr using the studentNbrCount variable
	public static String generateStudNbr() {
		if(studNbrCount <= 9999) {
		String strTmp = "SU" + Student.studNbrCount;
		return strTmp;
	}
		return null;
	}
	
}