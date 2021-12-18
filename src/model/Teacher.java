package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Teacher {

	private String ssNbr; //ssNbr is not a unique identifier
	private String name;
	private String employeeNbr; //employeeNbr is the unique identifier
	
	//ArrayList to hold multiple course curricula
	private ArrayList<CourseCurriculum> curricula = new ArrayList<CourseCurriculum>();
	//HashMap to hold courses
	private HashMap<String, Course> taughtCourses = new HashMap<String, Course>();
	//HasHMap to hold assessments which this teacher object is responsible for.
	private HashMap<String, Assessment> assessments = new HashMap<String, Assessment>();

	private static int empNbrCount = 1000;
	
	public Teacher(String ssNbr, String name) {
		this.ssNbr = ssNbr;
		this.name = name;
		this.employeeNbr = Teacher.generateEmployeeNbr();
	}
	//Method to add a CourseCurriculum object to the AL
	public void addCurriculum(CourseCurriculum curriculum) {
		curricula.add(curriculum);
	}
	//Method to find a CourseCurriculum object in the AL
	public CourseCurriculum findCurriculum(String courseID) {
		for(CourseCurriculum ccTmp : curricula) {
			if(ccTmp.getCourse().getCourseID().equals(courseID)) {
				return ccTmp;
			}
		}
		return null;
	}
	//Method to remove a CourseCurriculum object from the AL
	public CourseCurriculum removeCurriculum(String courseID) {
		int i = 0;
		for(CourseCurriculum ccTmp : curricula) {
			if(ccTmp.getCourse().getCourseID().equals(courseID)) {
				curricula.remove(i);
				return ccTmp;
			}
			i++;
		}
		return null;
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
	
	//This method generates an employee number according to the format "EMPXXXX", where the X:es represent an integer value starting at 1000.
	public static String generateEmployeeNbr() {
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
	public HashMap<String, Assessment> getAssessments() {
		return assessments;
	}
	public void setAssessments(HashMap<String, Assessment> assessments) {
		this.assessments = assessments;
	}
}