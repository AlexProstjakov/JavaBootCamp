package sef.FinalActivity;

public class Employee extends Person implements Comparable<Employee>{
	
	private String jobTitle;
	private String company;
	private int salary;

	
	
	public Employee() {
		
	}
	public Employee(String jobTitle, String company, int salary) {
		this.jobTitle=jobTitle;
		this.company=company;
		this.salary=salary;

	}

	
	protected int getSalary() {
		return salary;
	}
	protected void setSalary(int salary) {
		this.salary = salary;
	}
	protected String getCompany() {
		return company;
	}

	protected void setCompany(String company) {
		this.company = company;
	}

	protected String getJobTitle() {
		return jobTitle;
	}

	protected void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	
	public void introduce() {
		super.introduce();
		System.out.println("I am working as " + jobTitle + " in " + company);
	}
	
	@Override
    public int compareTo(Employee employee) {
        return this.salary - employee.salary;
    }
	
	public String toString() {
	    return String.format("(%s, %d)", name, salary);
	}

}
