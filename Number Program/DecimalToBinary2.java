import java.util.Scanner;
class DecimalToBinary2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();
	    String num1="";

	    while(num>0){
	    	int dig=num%2;
	    	num1=dig+num1;
	    	num/=2;
	    }
	    System.out.println(num1);
		
	}
}