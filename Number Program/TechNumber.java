import java.util.Scanner;
class TechNumber{
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

	   System.out.println("Right: "+rightHalf);
	   System.out.println("Left: "+ leftHalf);

	   System.out.println();
 
           int sum=rightHalf+leftHalf;
	   System.out.println("Sum: "+sum);
 System.out.println();
	   int sq=sum*sum;
	   System.out.println("Square: " +sq);

	   if(sq==num)
	   	System.out.println("Tech number");
	   else
  System.out.println("Not a Tech number");


	}
}
}