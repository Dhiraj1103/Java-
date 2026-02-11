import java.util.Scanner;
class HarshadNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        int copy=num;
        
        while(num!=0){
        	int dig=num%10;
            sum+=dig;
        	num/=10;
        }
 
        if(copy!=0 && (copy%sum==0)){
        	System.out.println("The number is Harshad Number");

        }
        else{
        	System.out.print("The number is not Harshad Number");
        }
	}
}