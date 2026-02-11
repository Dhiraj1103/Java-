import java.util.Scanner;
class StrongNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;

		while(num!=0){
			int fact=1;
			int dig=num%10;
			for(int i=1;i<=dig;i++){
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		System.out.println(sum);

		if(sum==copy){
			System.out.println("The number is Strong Number ");

		}
		else{
			System.out.println("The number is not a Strong Number");
		}
	}
}