import java.util.*;
class Armstrong2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int temp=num;
         int sum=0;
        int count=0;
		while(num!=0){
             count++;
             num/=10;
		}
		num=temp;
		while(num!=0){
          int dig=num%10;
          sum+=Math.pow(dig,count);
             num/=10;
		}
		System.out.println(sum);
		 if(temp==sum)
            	System.out.println("The number is Armstrong number");
            else
            	System.out.println("The number is not Armstrong number");

	}
}