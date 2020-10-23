package sef.FinalActivity;

public class Students {
	
	private String schoolName;
	
	public Students() {
		
	}
	
	protected String getSchoolName() {
		return schoolName;
	}

	protected void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	
	public void introduce() {
		System.out.println("I am studying in university " + schoolName);
	}

}
