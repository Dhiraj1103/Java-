import java.util.Scanner;
class NumberMethod{
	public static void main(String[] args) {
			for(; ; ){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("**********  Welcome to the Number Program  **********");
		System.out.println();
		System.out.println("1. Check Even Odd");
		System.out.println("2. Check Duck Number");
		System.out.println("3. Get Factors");
		System.out.println("4. Get Power");
		System.out.println("5. Get Factorial");
		System.out.println("6. Reverse the number");
		System.out.println("7. Check Prime or not");
		System.out.println("8. Get Fibonacci Series");
		System.out.println("9. Exit");

		System.out.println();
		System.out.print("Please choose the option from the above to perform the operations: ");
		int op=sc.nextInt();
		System.out.println();
		switch(op){
			case 1:
				System.out.println("You Choose Check Even Odd");
				evenOdd();
				break;
			case 2:
				System.out.println("You Choose Check Duck Number");
                checkDuck();
				break;

			case 3:
				System.out.println("You Choose Get Factors");
                factors();
				break;

            case 4:
				System.out.println("You Choose Get Power");
                power();
				break;
          
            case 5:
				System.out.println("You Choose Get Factorial");
                factorial();
				break;

            case 6:
				System.out.println("You Choose Reverse the number");
                reverse();
				break;

            case 7:
				System.out.println("You Choose Check Prime or not");
                checkPrime();
				break;

            case 8:
				System.out.println("You Choose Get Fibonacci Series");
                fibonacci();
				break;
            case 9:
				System.exit(0);
				break;

            default:
            	System.out.println("Invalid option");
            	break;

		}
	}
}


	public static void evenOdd(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		String res=num%2==0?"The number is Even":"The number is Odd";
		System.out.println(res);

	}
	public static void checkDuck(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		boolean isDuck=false;
		while(num!=0){
			int dig=num%10;
			if(dig==0){
				isDuck=true;
				break;
			}
		num/=10;
		}
			if(isDuck)
				System.out.println("The number is Duck number");
			else
				System.out.println("The number is not a Duck Number");
}
			public static void factors(){
               Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		   for(int i=1;i<=num/2;i++){
		   	if(num%i==0)
		   		System.out.println(i);
		   }
         }

         public static void power(){
         	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Base: ");
		int base=sc.nextInt();
		System.out.print("Enter the Power: ");
		int power=sc.nextInt();
		int ans=1;

		for(int i=0;i<power;i++){
			ans*=base;
		}
		System.out.println(ans);
            

         }

         public static void factorial(){
         	 Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		  int fact=1;
		  for(int i=1;i<=num;i++){
		  	fact*=i;
		  }
		  System.out.println(fact);
         }

         public static void reverse(){
         	 Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int rev=0;
		   while(num!=0){
		   	int dig=num%10;
		   	rev=rev*10+dig;
		   	num=num/10;
		   }
		   System.out.println(rev);
         }

         public static void checkPrime(){
         	 Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
            boolean isPrime=true;

            for(int i=2;i<=num/2;i++){
            	if(num%i==0){
            		isPrime=false;
            		break;
              }
            }
            if(isPrime)
            	System.out.println("The number is Prime");
            else
            	System.out.println("The number is not Prime");
         }

         public static void fibonacci(){
          Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int n1=0,n2=1,n3;
		for(int i=0;i<n;i++){
			n3=n1+n2;
           System.out.println(n1);
           n1=n2;
           n2=n3;
}
		}

          
}

