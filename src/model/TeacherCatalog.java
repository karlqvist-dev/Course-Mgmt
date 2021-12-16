package model;

import java.util.HashMap;

public class TeacherCatalog {
	
	//HashMap to hold Teacher objects
	private HashMap<String, Teacher> teacherRegistry = new HashMap<String, Teacher>();
	
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
	
	public HashMap<String, Teacher> getTeacherRegistry() {
		return teacherRegistry;
	}

	public void setTeacherRegistry(HashMap<String, Teacher> teacherRegistry) {
		this.teacherRegistry = teacherRegistry;
	}
	
	
}
