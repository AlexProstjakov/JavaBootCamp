package sef.FinalActivity;

public class CustomException extends Exception{
	
	public String toString() {
		return "This is my custom Exception for Person.setName";
	}
	
	public String getMessage() {
		String msg = "Name cannot contain numbers";
		return msg;
	}

}
