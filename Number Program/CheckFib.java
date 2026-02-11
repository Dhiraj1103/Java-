import java.util.Scanner;
class CheckFib{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();

		int n1=0,n2=1,n3;

		while(true){
			n3=n1+n2;
			if(n1==num){
				System.out.println("The number is Fibo Number");
				break;
			}
			else if(n1>num){
				System.out.println("The number is Not Fibo Number.");
				break;
			}
			else{
			n1=n2;
			n2=n3;
		}

		}

	
	}
}