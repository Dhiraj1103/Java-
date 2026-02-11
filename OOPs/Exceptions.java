package OOPs;
import java.util.Scanner; 
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Numerator: ");
      int num=sc.nextInt();
      System.out.println("Enter the Denominator: ");
      int den=sc.nextInt();
      
      try{
        System.out.println(num/den);
    	  
      }
      catch(ArithmeticException e){
    	  System.out.println("Dividing with zero is ot possible.");
    	  System.out.println(e);
      }
      catch(Exception e) {
    	  System.out.println("Nor possible");
      }
      System.out.println("Thank you");
	  
	}

}
