import java.util.Scanner;
class LCM{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the num1: ");
		int num1=sc.nextInt();
			System.out.print("Enter the num2: ");
		int num2=sc.nextInt();

		int large= num1>num2?num1:num2;

		int i=1;
		while(true){
			if((large*i)%num1==0 && (large*i)%num2==0){
				System.out.println("The LCM is "+(large*i));
				break;
			}
			i++;
		}
	}
}


