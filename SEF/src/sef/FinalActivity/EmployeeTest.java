package sef.FinalActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

	Employee employee;
	public void setUp() throws Exception {
		super.setUp();
		employee = new Employee("Developer", "Accenture", 3000);
		employee.setName("Alex");
		employee.setAge(24);
	}

	
	public void tearDown() throws Exception {
		super.tearDown();

	}

	
	public void testGetName() {
		assertEquals("Alex", employee.getName());
	}
	public void testGetAge() {
		assertEquals(24, employee.getAge());
	}
	public void testGetJobTitle() {
		assertEquals("Developer", employee.getJobTitle());
	}
	public void testGetCompany() {
		assertEquals("Accenture", employee.getCompany());
	}
	public void testGetSalary() {
		assertEquals(3000, employee.getSalary());
	}

}
