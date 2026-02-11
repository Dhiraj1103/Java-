import java.util.Scanner;
class SplitNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();

	
		int count=(int) Math.log10(num)+1;

		System.out.println("Count "+count);
	   if(count%2==0){
	   	int divide=1;
	   	for(int i=1;i<=count/2;i++){
	   		divide*=10;
	   	}
	   
	   	int rightHalf=num%divide;
	   	int leftHalf=num/divide;

	   System.out.println(rightHalf);
	   System.out.println(leftHalf);
	}}
}