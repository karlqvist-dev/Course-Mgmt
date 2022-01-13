package model;

import java.util.HashMap;

public class StudentCatalog {
    
    private HashMap<String, Student> studentRegistry = new HashMap<String, Student>(); // HashMap to hold Student objects


    
	public void addStudent(String studentNbr, Student student) { //Method for adding a new student to the HM
		studentRegistry.put(studentNbr, student);
	}
	
	 
	public Student findStudent(String studentNbr) { //Method for finding a student in the HM
		return studentRegistry.get(studentNbr);
	}
	
	
	public Student removeStudent(String studentNbr) { //Method for removing a student from the HM.
		return studentRegistry.remove(studentNbr);
	}


    /*-----------------Setters & getters-----------------*/
    public HashMap<String, Student> getStudentRegistry() {
		return studentRegistry;
	}

	public void setStudentRegistry(HashMap<String, Student> studentRegistry) {
		this.studentRegistry = studentRegistry;
	}
}
