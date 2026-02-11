import java.util.Scanner;
class PrimeDigit{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();

		while(num!=0){
			int dig=num%10;
			boolean isPrime=true;
			for(int i=2;i<dig;i++){
			if(dig%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime==true){
			System.out.println(num);
		}
		num/=10;

}


		}
	}
