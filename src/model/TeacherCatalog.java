package model;

import java.util.HashMap;

public class TeacherCatalog {
	private HashMap<String, Teacher> teacherRegistry = new HashMap<String, Teacher>();

	public void addTeacher(String employeeNbr, Teacher teacher) {
		teacherRegistry.put(employeeNbr, teacher);
	}
	
	public Teacher findTeacher(String employeeNbr) {
		return teacherRegistry.get(employeeNbr);
	}
	
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
