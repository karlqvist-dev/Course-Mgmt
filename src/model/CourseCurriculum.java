package model;

import java.util.*;

public class CourseCurriculum {

	private ArrayList<String> learningGoals = new ArrayList<String>();
	
	Course course;
	Teacher teacher;
	
	public CourseCurriculum(Course course, Teacher teacher) {
		this.course = course;
		this.teacher = teacher;
	}
	
	public void addGoal(String goal) {
		learningGoals.add("Learning goal: " + goal);
	}
	
	//TODO printGoals()

	public ArrayList<String> getLearningGoal() {
		return this.learningGoals;
	}

	public void setLearningGoal(ArrayList<String> learningGoal) {
		this.learningGoals = learningGoal;
	}

}