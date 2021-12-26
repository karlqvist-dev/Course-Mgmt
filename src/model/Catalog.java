package model;

import java.util.HashMap;

public class Catalog {
	
	//HashMap to hold Teacher objects
	private HashMap<String, Teacher> teacherRegistry = new HashMap<String, Teacher>();
	private HashMap<String, Student> studentRegistry = new HashMap<String, Student>();
	
	//Method for adding a new teacher to the HM
	public void addTeacher(String employeeNbr, Teacher teacher) {
		teacherRegistry.put(employeeNbr, teacher);
	}
	
	//Method for finding a teacher in the HM
	public Teacher findTeacher(String employeeNbr) {
		return teacherRegistry.get(employeeNbr);
	}
	
	//Method for removing a teacher from the HM.
	public Teacher removeTeacher(String employeeNbr) {
		return teacherRegistry.remove(employeeNbr);
	}
	
	
	
	//Method for adding a new student to the HM
	public void addStudent(String studentNbr, Student student) {
		studentRegistry.put(studentNbr, student);
	}
	
	//Method for finding a student in the HM
	public Student findStudent(String studentNbr) {
		return studentRegistry.get(studentNbr);
	}
	
	//Method for removing a student from the HM.
	public Student removeStudent(String studentNbr) {
		return studentRegistry.remove(studentNbr);
	}
	
	
	
	public HashMap<String, Teacher> getTeacherRegistry() {
		return teacherRegistry;
	}

	public void setTeacherRegistry(HashMap<String, Teacher> teacherRegistry) {
		this.teacherRegistry = teacherRegistry;
	}

	public HashMap<String, Student> getStudentRegistry() {
		return studentRegistry;
	}

	public void setStudentRegistry(HashMap<String, Student> studentRegistry) {
		this.studentRegistry = studentRegistry;
	}
	
	
}
