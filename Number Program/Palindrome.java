import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int reverse=0;
		int copy=num;

		while(num!=0){
            int digit=num%10;
             reverse=reverse*10+digit;
             
             num=num/10;
		}

		if(copy==reverse){
			System.out.println("The number is Palindrome");
		}
		else{
			System.out.println("The number is not Palindrome");
		}
	}
}