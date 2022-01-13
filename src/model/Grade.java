package model;

public class Grade {

	private int gradeVal; //the grade as such, this should never be assigned a value above 7 as the grading scale is 1-7
	private int score; // the score for the particular result. This determines the value of gradeVal.
	
	private Assessment assessment;
	private Student student;
	
	public Grade(Assessment assessment, Student student, int gradeVal) {
		this.assessment = assessment;
		this.student = student;
		this.gradeVal = gradeVal;
	}

	public int convertToGrade(int score) { // the grade is determined by how large a percentage of the Assessment's MAX_POINTS value the score makes up
		
		if(score < (getAssessment().getMAX_POINTS() * 0.30)) { // if the score is below 30% of the max points for the assessment, a 1 is awarded.
			gradeVal = 1;
		}
		else if(score < (getAssessment().getMAX_POINTS() * 0.50)) { // if the score is above 30%, but below 50% of the max points for the assessment, a 2 is awarded.
			gradeVal = 2;
		}
		else if(score < (getAssessment().getMAX_POINTS() * 0.55)) { // if the score is between 50% and 55% of the max points for the assessment, a 3 is awarded.
			gradeVal = 3;
		}
		else if(score < (getAssessment().getMAX_POINTS() * 0.65)) { // if the score is between 55% and 65% of the max points for the assessment, a 4 is awarded.
			gradeVal = 4;
		}
		else if(score < (getAssessment().getMAX_POINTS() * 0.75)) { // if the score is between 65% and 75% of the max points for the assessment, a 5 is awarded.
			gradeVal = 5;
		}
		else if(score < (getAssessment().getMAX_POINTS() * 0.85)) { // if the score is between 75% and 85% of the max points for the assessment, a 6 is awarded.
			gradeVal = 6;
		}
		else{ // if the score is above 85% of the max points for the assessment, a 7 is awarded.
			gradeVal = 7;
		}
	
		return gradeVal;
	}
	
	/*-----------------Setters & getters-----------------*/
	public int getGradeVal() {
		return this.gradeVal;
	}

	public void setGradeVal(int gradeVal) {
		this.gradeVal = gradeVal;
	}

	public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


}