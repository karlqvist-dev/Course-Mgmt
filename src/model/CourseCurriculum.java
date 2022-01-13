package model;

import java.util.*;

public class CourseCurriculum {

	private ArrayList<String> learningGoals = new ArrayList<String>();
	
	Course course;
	
	public CourseCurriculum(Course course) {
		this.course = course;
	}
	
	public void addGoal(String goal) {
		learningGoals.add("Learning goal: " + goal);
	}
	
	public void printGoals() {
		for(String strTmp : learningGoals) {
			System.out.println(strTmp + "\n");
		}
	}


	public ArrayList<String> getLearningGoals() {
		return learningGoals;
	}

	public void setLearningGoals(ArrayList<String> learningGoals) {
		this.learningGoals = learningGoals;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}