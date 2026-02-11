import java.util.Scanner;
class Prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		boolean isPrime=true;

		for(int i=2;i<num/2;i++){
			if(num%i==0){
				isPrime=false;
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