import java.util.Scanner;
class Count_nth_fib{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.print("Enter the Limit: "); 
		int limit=sc.nextInt();
        int n1=0,n2=1,n3;
        int count=0;

        for(;n1<limit;count++){
        	n3=n1+n2;
        
        	n1=n2;
        	n2=n3;
        }
        System.out.println(count);

	}
}