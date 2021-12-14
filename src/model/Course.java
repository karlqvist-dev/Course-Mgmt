package model;

import java.util.HashMap;

public class Course {

	private String courseID;
	private String name;

	private Teacher teacher;
	private CourseCurriculum courseCurriculum;
	
	private HashMap<String, Assessment> courseAssessments = new HashMap<String, Assessment>();
	private HashMap<String, Student> courseStudents = new HashMap<String, Student>();
	
	public Course(String courseID, String name, Teacher teacher, CourseCurriculum courseCurriculum) {
		this.courseID = courseID;
		this.name = name;
		this.teacher = teacher;
		this.courseCurriculum = courseCurriculum;
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

	public HashMap<String, Assessment> getCourseAssessments() {
		return courseAssessments;
	}

	public void setCourseAssessments(HashMap<String, Assessment> courseAssessments) {
		this.courseAssessments = courseAssessments;
	}

	public HashMap<String, Student> getCourseStudents() {
		return courseStudents;
	}

	public void setCourseStudents(HashMap<String, Student> courseStudents) {
		this.courseStudents = courseStudents;
	}
	

}