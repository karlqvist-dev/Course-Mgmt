package model;

import java.util.HashMap;

public class Course {

	private String courseID; //Unique identifier
	private String name;

	private Teacher teacher;
	private CourseCurriculum courseCurriculum;
	
	private HashMap<String, Assessment> assessments = new HashMap<String, Assessment>();
	private HashMap<String, Student> students = new HashMap<String, Student>();
	
	private static int courseIDCount = 5000;
	

	public Course(String name, Teacher teacher) {
		this.name = name;
		this.teacher = teacher;
		this.courseID = Course.generateCourseID();
	}
	
	public void addStudent(String studentID, Student student) {
		students.put(studentID, student);
	}
	
	public Student findStudent(String studentID) {
		return students.get(studentID);
	}
	
	public Student removeStudent(String studentID) {
		return students.remove(studentID);
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
	
	public String getCourseID() {
		return this.courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public CourseCurriculum getCourseCurriculum() {
		return courseCurriculum;
	}

	public void setCourseCurriculum(CourseCurriculum courseCurriculum) {
		this.courseCurriculum = courseCurriculum;
	}

	public HashMap<String, Assessment> getAssessments() {
		return assessments;
	}

	public void setAssessments(HashMap<String, Assessment> assessments) {
		this.assessments = assessments;
	}

	public HashMap<String, Student> getStudents() {
		return students;
	}

	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}
	
	public static int getCourseIDCount() {
		return courseIDCount;
	}

	public static void setCourseIDCount(int courseIDCount) {
		Course.courseIDCount = courseIDCount;
	}
	//This method generates a courseID based on the value of the static courseIDCount variable
	public static String generateCourseID() {
		if(courseIDCount <= 9999) {
		String strTmp = "C" + Course.courseIDCount;
		courseIDCount++;
		return strTmp;
		}
		return null;
	}
}