package model;

import java.util.HashMap;

public class TeacherCatalog {
    
	private HashMap<String, Teacher> teacherRegistry = new HashMap<String, Teacher>(); //HashMap to hold Teacher objects


    
	public void addTeacher(String employeeNbr, Teacher teacher) { //Method for adding a new teacher to the HM
		teacherRegistry.put(employeeNbr, teacher);
	}
	
	
	public Teacher findTeacher(String employeeNbr) { //Method for finding a teacher in the HM
		return teacherRegistry.get(employeeNbr);
	}
	
	
	public Teacher removeTeacher(String employeeNbr) { //Method for removing a teacher from the HM.
		return teacherRegistry.remove(employeeNbr);
	}

    /*-----------------Setters & getters-----------------*/
    public HashMap<String, Teacher> getTeacherRegistry() {
		return teacherRegistry;
	}

	public void setTeacherRegistry(HashMap<String, Teacher> teacherRegistry) {
		this.teacherRegistry = teacherRegistry;
	}
}
