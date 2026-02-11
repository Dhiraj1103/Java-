package ExceptionHandling;

public class throwKeyword {

	public static void checkage(int a) {
		if(a<18) throw new ArithmeticException("Not eligible to vote");
		else System.out.println("Eligible to vote");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          checkage(19);
	}

}
