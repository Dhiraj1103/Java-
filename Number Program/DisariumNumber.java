import java.util.Scanner;
class DisariumNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
          int temp=num;   
     int count=(int) Math.log10(num)+1;

     int sum=0;
     while(num!=0){
     	int dig=num%10;
     	int product=1;
     	for(int i=1;i<=count;i++){
     		product*=dig;
     	}
     	count--;
     	sum+=product;
     	num/=10;
     }
     if(temp==sum)
     	System.out.println("Disarium Number");
     else
         System.out.println("Not Disarium Number");
	}
}