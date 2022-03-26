package model;

import java.util.HashMap;
import java.util.Map;

public class Teacher {

	private String ssNbr; //ssNbr is not a unique identifier
	private String name;
	private String employeeNbr; //employeeNbr is used as a unique identifier
	
	private HashMap<String, Course> taughtCourses = new HashMap<String, Course>(); //HashMap to hold courses
	private HashMap<String, Assessment> assessments = new HashMap<String, Assessment>(); //HasHMap to hold assessments which this teacher object is responsible for.
	
	private static int empNbrCount = 1000;
	
	public Teacher(String ssNbr, String name) {
		this.ssNbr = ssNbr;
		this.name = name;
		this.employeeNbr = Teacher.generateEmployeeNbr();
	}
	
	public void nullify() { //Clears all associations, this method is used when removing a teacher object. The taught course retains the teacher value to keep history.
		this.assessments.clear();
		for (Map.Entry<String, Assessment> entry : this.assessments.entrySet()) {
			entry.getValue().setTeacher(null);
		}
		this.taughtCourses.clear();
	}

	public void addCourse(String courseID, Course course) {
		taughtCourses.put(courseID, course);
	}
	public Course findCourse(String courseID) {
		return taughtCourses.get(courseID);
	}
	public Course removeCourse(String courseID) {
		return taughtCourses.remove(courseID);
	}
	public void addAssessment(String testID, Assessment assessment) {
		assessments.put(testID, assessment);
	}
	public Assessment findAssessment(String testID) {
		return assessments.get(testID);
	}
	public Assessment removeAssessment(String testID) {
		return assessments.remove(testID);
	}
	
	public static String generateEmployeeNbr() { //This method generates an employee number according to the format "EMPXXXX", where the X:es represent an integer value starting at 1000.
		if(empNbrCount <= 9999) {
		String strTmp = "EMP" + Teacher.empNbrCount;
		Teacher.empNbrCount++;
		return strTmp;
		}
		return null;
	}
	//setters and getters
	public static int getEmpNbrCount() {
		return empNbrCount;
	}
	public static void setEmpNbrCount(int empNbrCount) {
		Teacher.empNbrCount = empNbrCount;
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
	public HashMap<String, Course> getTaughtCourses() {
		return taughtCourses;
	}

	public void setTaughtCourses(HashMap<String, Course> taughtCourses) {
		this.taughtCourses = taughtCourses;
	}
	public HashMap<String, Assessment> getAssessments() {
		return assessments;
	}
	public void setAssessments(HashMap<String, Assessment> assessments) {
		this.assessments = assessments;
	}
}