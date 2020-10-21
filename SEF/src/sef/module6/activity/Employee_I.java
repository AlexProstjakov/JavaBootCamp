package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I  {
	
	//Attributes
	private double salary;
	private String title;
	
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	public Employee_I() {
		this.title="Unknown";
		this.salary=0;
		System.out.println("I'm an Employee_I constructor");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

}
