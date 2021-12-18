package test;

import model.Course;
import model.CourseCurriculum;
import model.Exam;
import model.Grade;
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
		c1.addAssessment(ex1.getTestID(), ex1);
		c1.getTeacher().addAssessment(ex1.getTestID(), ex1);
		
		Exam ex2 = new Exam("2022-06-01", c2, c2.getTeacher(), 180);
		c2.addAssessment(ex2.getTestID(), ex2);
		c2.getTeacher().addAssessment(ex2.getTestID(), ex2);
		
		Exam ex3 = new Exam("2022-01-17", c3, c3.getTeacher(), 240);
		c3.addAssessment(ex3.getTestID(), ex3);
		c3.getTeacher().addAssessment(ex3.getTestID(), ex3);
		
		WrittenAssignment wa1 = new WrittenAssignment("2022-02-04", c4, c4.getTeacher());
		c4.addAssessment(wa1.getTestID(), wa1);
		wa1.getTeacher().addAssessment(wa1.getTestID(), wa1);
		
		WrittenAssignment wa2 = new WrittenAssignment("2022-02-04", c5, c5.getTeacher());
		c5.addAssessment(wa2.getTestID(), wa2);
		wa2.getTeacher().addAssessment(wa2.getTestID(), wa2);
		
		WrittenAssignment wa3 = new WrittenAssignment("2022-02-04", c6, c6.getTeacher());
		c6.addAssessment(wa3.getTestID(), wa3);
		wa3.getTeacher().addAssessment(wa3.getTestID(), wa3);
		
		Grade g1 = new Grade(ex1, s1, 6);
		ex1.addGrade(g1);
		s1.addGrade(g1);
		
		Grade g2 = new Grade(ex2, s1, 4);
		ex2.addGrade(g2);
		s1.addGrade(g2);
		
		Grade g3 = new Grade(ex1, s2, 2);
		ex1.addGrade(g3);
		s2.addGrade(g3);
		
		Grade g4 = new Grade(ex2, s2, 3);
		ex2.addGrade(g4);
		s4.addGrade(g4);
		
		Grade g5 = new Grade(ex3, s3, 4);
		ex3.addGrade(g5);
		s3.addGrade(g5);
		
		Grade g6 = new Grade(wa1, s3, 4);
		ex3.addGrade(g6);
		s3.addGrade(g6);
		
		Grade g7 = new Grade(ex3, s4, 5);
		ex3.addGrade(g7);
		ex3.addGrade(g7);
		
		Grade g8 = new Grade(wa1, s4, 6);
		wa1.addGrade(g8);
		s4.addGrade(g8);
		
		Grade g9 = new Grade(wa2, s5, 3);
		wa2.addGrade(g9);
		s5.addGrade(g9);
		
		Grade g10 = new Grade(wa3, s5, 3);
		wa3.addGrade(g10);
		s5.addGrade(g10);
		
		Grade g11 = new Grade(wa2, s6, 5);
		wa2.addGrade(g11);
		s6.addGrade(g11);
		
		Grade g12 = new Grade(wa3, s6, 5);
		wa3.addGrade(g12);
		s6.addGrade(g12);
		
		Grade g13 = new Grade(ex1, s7, 7);
		ex1.addGrade(g13);
		s7.addGrade(g13);
		
		Grade g14 = new Grade(ex2, s7, 1);
		ex2.addGrade(g14);
		s7.addGrade(g14);
		
		Grade g15 = new Grade(ex3, s8, 6);
		ex3.addGrade(g15);
		s8.addGrade(g15);
		
		Grade g16 = new Grade(wa1, s8, 4);
		wa1.addGrade(g16);
		s8.addGrade(g16);
		
		
		System.out.println(ex1.getTestID());
		System.out.println(ex2.getTestID());
		System.out.println(ex3.getTestID());
		System.out.println(wa1.getTestID());
		System.out.println(wa2.getTestID());
		System.out.println(wa3.getTestID());
		
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
		
		cc1 = null;
		cc2 = null;
		cc3 = null;
		cc4 = null;
		cc5 = null;
		cc6 = null;
		
		s1 = null;
		s2 = null;
		s3 = null;
		s4 = null;
		s5 = null;
		s6 = null;
		s7 = null;
		s8 = null;
		
		ex1 = null;
		ex2 = null;
		ex3 = null;
		wa1 = null;
		wa2 = null;
		wa3 = null;
		
		g1 = null;
		g2 = null;
		g3 = null;
		g4 = null;
		g5 = null;
		g6 = null;
		g7 = null;
		g8 = null;
		g9 = null;
		g10 = null;
		g11 = null;
		g12 = null;
		g13 = null;
		g14 = null;
		g15 = null;
		g16 = null;
	}

}
