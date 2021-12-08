package education;

public abstract class Assessment {

	/**
	 * Date of submission
	 */
	private String subDate;
	private String testId;

	public String getSubDate() {
		return this.subDate;
	}

	public void setSubDate(String subDate) {
		this.subDate = subDate;
	}

	public String getTestId() {
		return this.testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

}