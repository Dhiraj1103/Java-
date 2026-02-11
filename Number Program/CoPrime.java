import java.util.Scanner;
class CoPrime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter num1: ");
		int num1=sc.nextInt();
		System.out.print("Enter num2: ");
		int num2=sc.nextInt();

		int small= num1<num2? num1:num2;
        while(true){
        	if(num1%small==0 && num2%small==0){
        	
        		break;
        	}
        	small--;
        }
        if(small==1){
        	System.out.println("The is number is Co-Prime");
        }
        else{
        	System.out.println("The number is not Co-Prime");
        }
	}
}