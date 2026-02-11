import java.util.Scanner;
class Nth_fib{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the Nth_fib: ");
		int num=sc.nextInt();
         int n1=0,n2=1,n3;
		for(int i=1;i<num;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
		System.out.println(n1);
	}
}