package sef.FinalActivity;

public class Person {
	
	protected String name;
	protected int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	
	protected String getName() {
		return name;
	}

	public void setName(String name) throws CustomException{
		
		String [] b = {"0","1","2","3","4","5","6","7","8","9"};
		int flag=0;
		for (int i=0; i<10; i++) {
			if (name.contains(b[i])==true){
				flag=1;
			}
		}if (flag==1) {
			throw new CustomException();
			
		}else {
			this.name=name;
		}
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	public void introduce() {
		 System.out.println("My name is " + name + " and I am " + age + " years old");
	}

}
