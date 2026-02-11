import java.util.Scanner;
class Automorphic{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();
            int count=0;
            int temp=num;
		while(num!=0){
			count++;
			num/=10;
		}
		num=temp;
		int divide=1;
		for(int i=1;i<=count;i++){
			divide*=10;
		}
		int sq=num*num;
		int dig=sq%divide;


	
	System.out.println(dig);
	if(num==dig)
		System.out.println("The number is Automorphic");
	else
		System.out.println("The number is not Automorphic");
}
}