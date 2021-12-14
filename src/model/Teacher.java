package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Teacher {

	//ssNbr is not a unique identifier
	private String ssNbr;
	//employeeNbr is the unique identifier
	private String employeeNbr;
	private String name;
	
	private ArrayList<CourseCurriculum> curricula = new ArrayList<CourseCurriculum>();
	private HashMap<String, Course> taughtCourses = new HashMap<String, Course>();

	
	public Teacher(String ssNbr, String employeeNbr, String name) {
		this.ssNbr = ssNbr;
		this.employeeNbr = employeeNbr;
		this.name = name;
	}
	
	public String getSsNbr() {
		return this.ssNbr;
	}

	public void setSsNbr(String ssNbr) {
		this.ssNbr = ssNbr;
	}

	public String getEmployeeNbr() {
		return this.employeeNbr;
	}

	public void setEmployeeNbr(String employeeNbr) {
		this.employeeNbr = employeeNbr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<CourseCurriculum> getCurricula() {
		return curricula;
	}

	public void setCurricula(ArrayList<CourseCurriculum> curricula) {
		this.curricula = curricula;
	}

	public HashMap<String, Course> getTaughtCourses() {
		return taughtCourses;
	}

	public void setTaughtCourses(HashMap<String, Course> taughtCourses) {
		this.taughtCourses = taughtCourses;
	}

}