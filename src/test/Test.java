package test;

import model.Course;
import model.CourseCurriculum;
import model.Student;
import model.Teacher;
import model.TeacherCatalog;

public class Test {

	public static void main(String[] args) {
		TeacherCatalog tc = new TeacherCatalog();
		
		Teacher tea1 = new Teacher("780404-7482", "Kathleen Jenkins");
		tc.addTeacher(tea1.getEmployeeNbr(), tea1);
		
		Teacher tea2 = new Teacher("850201-5566", "Leonard Hartwell");
		tc.addTeacher(tea2.getEmployeeNbr(), tea2);
		
		Teacher tea3 = new Teacher("920817-1233", "Jerome Wells");
		tc.addTeacher(tea3.getEmployeeNbr(), tea3);
		
		
		Course c1 = new Course("Geography 101", tea1);
		tea1.addCourse(c1.getCourseID(), c1);
		Course c2 = new Course("Introduction to Networks", tea1);
		tea1.addCourse(c2.getCourseID(), c2);
		
		Course c3 = new Course("Ultimate Trading: From Beginner to Pro", tea2);
		tea2.addCourse(c3.getCourseID(), c3);
		Course c4 =new Course("Gardening Masterclass", tea2);
		tea2.addCourse(c4.getCourseID(), c4);
		
		Course c5 = new Course("South American Literary History", tea3);
		tea3.addCourse(c5.getCourseID(), c5);
		Course c6 = new Course("Applied Physics", tea3);
		tea3.addCourse(c6.getCourseID(), c6);
		
		
		CourseCurriculum cc1 = new CourseCurriculum(c1, tea1);
		cc1.addGoal("Capital cities");
		cc1.addGoal("Biomes");
		cc1.addGoal("Terrain elevation");
		
		CourseCurriculum cc2 = new CourseCurriculum(c2, tea1);
		cc2.addGoal("IP subnetting");
		cc2.addGoal("VLAN configuration");
		cc2.addGoal("Routing");
		cc2.addGoal("Physical troubleshooting");
		
		CourseCurriculum cc3 = new CourseCurriculum(c3, tea2);
		cc3.addGoal("Techincal analysis");
		cc3.addGoal("Stop loss");
		cc3.addGoal("Fundamental analysis");
		
		CourseCurriculum cc4 = new CourseCurriculum(c4, tea2);
		cc4.addGoal("Watering technique");
		cc4.addGoal("Fertilization");
		cc4.addGoal("Composting");
		cc4.addGoal("Tool knowledge");
		
		CourseCurriculum cc5 = new CourseCurriculum(c5, tea3);
		cc5.addGoal("60's literature");
		cc5.addGoal("70's literature");
		cc5.addGoal("Knowledge of cultural context");
		
		CourseCurriculum cc6 = new CourseCurriculum(c6, tea3);
		cc6.addGoal("Industrial applications");
		cc6.addGoal("Nanoscale technology");
		cc6.addGoal("Interdisciplinary engineering");
		cc6.addGoal("Ultrafast physics");
		cc6.addGoal("Condensed matter");
		
		
		Student s1 = new Student("990327-9412", "Luana Boshers");
		
		
		//Variable nullification
		tea1 = null;
		tea2 = null;
		tea3 = null;
		
		c1 = null;
		c2 = null;
		c3 = null;
		c4 = null;
		c5 = null;
		c6 = null;
		
		
	}

}
