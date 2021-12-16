package test;

import model.Course;
import model.CourseCurriculum;
import model.Exam;
import model.Student;
import model.Teacher;
import model.TeacherCatalog;
import model.WrittenAssignment;

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
		s1.addCourse(c1.getCourseID(), c1);
		c1.addStudent(s1.getStudentNbr(), s1);
		s1.addCourse(c2.getCourseID(), c2);
		c2.addStudent(s1.getStudentNbr(), s1);
		
		Student s2 = new Student("890118-8125", "Ben Evenstad");
		s2.addCourse(c1.getCourseID(), c1);
		c1.addStudent(s2.getStudentNbr(), s2);
		s2.addCourse(c2.getCourseID(), c2);
		c2.addStudent(s2.getStudentNbr(), s2);
		
		Student s3 = new Student("810722-2467", "Heriberto Amory");
		s3.addCourse(c3.getCourseID(), c3);
		c3.addStudent(s3.getStudentNbr(), s3);
		s3.addCourse(c4.getCourseID(), c4);
		c4.addStudent(s3.getStudentNbr(), s3);
		
		Student s4 = new Student("010917-5246", "Patricia Cessna");
		s4.addCourse(c3.getCourseID(), c3);
		c3.addStudent(s4.getStudentNbr(), s4);
		s4.addCourse(c4.getCourseID(), c4);
		c4.addStudent(s4.getStudentNbr(), s4);
		
		Student s5 = new Student("980304-6524", "Dori Delorenzo");
		s5.addCourse(c5.getCourseID(), c5);
		c5.addStudent(s5.getStudentNbr(), s5);
		s5.addCourse(c6.getCourseID(), c6);
		c6.addStudent(s5.getStudentNbr(), s5);
		
		Student s6 = new Student("920202-7554", "Patrick Philpot");
		s6.addCourse(c5.getCourseID(), c5);
		c5.addStudent(s6.getStudentNbr(), s6);
		s6.addCourse(c6.getCourseID(), c6);
		c6.addStudent(s6.getStudentNbr(), s6);
		
		Student s7 = new Student("961129-2749", "Maurine Milos");
		s7.addCourse(c1.getCourseID(), c1);
		c1.addStudent(s7.getStudentNbr(), s7);
		s7.addCourse(c2.getCourseID(), c2);
		c2.addStudent(s7.getStudentNbr(), s7);
		
		Student s8 = new Student("841111-8385", "Mildred Nevius");
		s8.addCourse(c3.getCourseID(), c3);
		c3.addStudent(s8.getStudentNbr(), s8);
		s8.addCourse(c4.getCourseID(), c4);
		c4.addStudent(s8.getStudentNbr(), s8);
		
		Exam ex1 = new Exam("2022-05-05", c1, c1.getTeacher(), 120);
		
		Exam ex2 = new Exam("2022-06-01", c2, c2.getTeacher(), 180);
		
		Exam ex3 = new Exam("2022-01-17", c3, c3.getTeacher(), 240);
		
		WrittenAssignment wa1 = new WrittenAssignment("2022-02-04", c4, c4.getTeacher());
		
		System.out.println(ex1.getTestID());
		System.out.println(ex2.getTestID());
		System.out.println(ex3.getTestID());
		System.out.println(wa1.getTestID());
		
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
