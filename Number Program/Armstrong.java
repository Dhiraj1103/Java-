import java.util.Scanner;
class Armstrong{
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
                int sum=0;
            while(num!=0){
            	int dig=num%10;
            	int product=1;
            	  for(int i=1;i<=count;i++){
            	  	product*=dig;
            	  }
            	  sum+=product;
            	  num/=10;
            }
            System.out.println(sum);

            if(temp==sum)
            	System.out.println("The number is Armstrong number");
            else
            	System.out.println("The number is not Armstrong number");


          

	}
}