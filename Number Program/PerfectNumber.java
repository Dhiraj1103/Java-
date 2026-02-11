import java.util.Scanner;
class PerfectNumber{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;

		for(int i=1;i<=num/2;i++){
			if(num%i==0){
              sum+=i;
			}
		}
		String ans =(sum==num)?"The number is Perfect Number":"The number is not a Perfect Number";
		System.out.println(ans);
	}
}