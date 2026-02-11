import java.util.Scanner;
class PrimeFib{
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

		if(n1==num){
			boolean isPrime=true;
			for(int i=2;i<num/2;i++){
				if(num%i==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime==true){
				System.out.println("The number is Prime");
			}
			else{
				System.out.println("The number is not Prime");
			}
		}
	}
}