package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {

	
	public static void addition(int a, int b) {
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("Cannot be divided by zero");
		}
		
		catch (Exception e) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("Program execution completed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=sc.nextInt();
		System.out.print("Enter b: ");

		int b=sc.nextInt();
		
		addition(a, b);
		}
		catch (InputMismatchException e) {
			System.out.println("Please enter valid number");
		}
       
	}

}
