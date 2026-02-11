package ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String message) {
		super(message);
	}
}

class AgeValidation{
	  String name;
	  int age;
	public AgeValidation(){
		
	}
	
	public AgeValidation(String name, int age)  {
	    if(age<18) {
        	throw new InvalidAgeException("Invalid age object cannot be created");

        }
        else {
        	this.name= name;
        	this.age=age;
        	System.out.println("Object created successfully");
        }
	}
	
	
}

public class Assignment2 {

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
    try {
		System.out.print("Enter name: ");
        String name=sc.nextLine();
		System.out.print("Enter age: ");
		int age= sc.nextInt();
		AgeValidation a1= new AgeValidation(name, age);

	} catch (Exception e) {
		System.out.println("Error: "+e.getMessage());
	}
    

}
}
