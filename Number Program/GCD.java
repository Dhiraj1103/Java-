import java.util.Scanner;
class GCD{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter num1: ");
		int num1=sc.nextInt();
		System.out.print("Enter num2: ");
		int num2=sc.nextInt();

		int small= num1<num2? num1:num2;
        while(true){
        	if(num1%small==0 && num2%small==0){
        		System.out.println(small);
        		break;
        	}
        	small--;
        }
	}
}