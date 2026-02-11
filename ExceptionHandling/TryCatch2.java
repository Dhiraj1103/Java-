package ExceptionHandling;

public class TryCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   int a[]= {1,2,3,5};
	   System.out.println(a[9]);
	   
   }
   catch (ArrayIndexOutOfBoundsException e) {
	   System.out.println("Enter index less than 4");
   }
   finally {
	   System.out.println("Finally will be executed always");
   }
	}

}
