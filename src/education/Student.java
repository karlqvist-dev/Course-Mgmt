package education;

public class Student {

	/**
	 * Social Security number, not used as a unique identifier.
	 */
	private String ssNbr;
	//Student number, used as a unique identifier.
	private String studentNbr;
	private String name;

	public String getSsNbr() {
		return this.ssNbr;
	}

	public void setSsNbr(String ssNbr) {
		this.ssNbr = ssNbr;
	}

	public String getStudentNbr() {
		return this.studentNbr;
	}

	public void setStudentNbr(String studentNbr) {
		this.studentNbr = studentNbr;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}