package sef.FinalActivity;

import java.util.Arrays;

public class FirstActivity {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[4];
		
		employees[0] = new Employee("Tester", "Accenture", 2000);
		employees[1] = new Employee("Developer", "Accenture", 3000);
		employees[2] = new Employee("Pilot", "airBaltic", 2500);
		employees[3] = new Employee("Cashier", "Rimi", 900);
		
		//Employee #1 - setting Name and age
		
		try{
			employees[0].setName("Ivan");
		}catch(CustomException c){
			c.getMessage();
			System.out.println("Name cannot contain numbers");
		}
		
		employees[0].setAge(25);
		
		
		
		//Employee #2 - setting Name and age
		
		try{
			employees[1].setName("Anastasija");
		}catch(CustomException c){
			c.getMessage();
			System.out.println("Name cannot contain numbers");
		}
			
		employees[1].setAge(21);
		
	
		
		
		//Employee #3 - setting Name and age
		
		try{
			employees[2].setName("Andrejs");
		}catch(CustomException c){
			c.getMessage();
			System.out.println("Name cannot contain numbers");
		}
			
		employees[2].setAge(31);
		
		
		
		//Employee #4 - setting Name and age
		
		try{
			employees[3].setName("Vladimir");
		}catch(CustomException c){
			c.getMessage();
			System.out.println("Name cannot contain numbers");
		}
			
		employees[3].setAge(38);
		
		
		//Sorting employees in increasing salary order
		
		Arrays.sort(employees);
		
		employees[0].introduce();
		System.out.println("My salary is " + employees[0].getSalary());
		System.out.println("--------------------------------");
		employees[1].introduce();
		System.out.println("My salary is " + employees[1].getSalary());
		System.out.println("--------------------------------");
		employees[2].introduce();
		System.out.println("My salary is " + employees[2].getSalary());
		System.out.println("--------------------------------");
		employees[3].introduce();
		System.out.println("My salary is " + employees[3].getSalary());
		System.out.println("--------------------------------");
		
	
		
	}

}
