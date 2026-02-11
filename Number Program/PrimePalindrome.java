import java.util.Scanner;
class PrimePalindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();
         boolean isPrime=true;
         int reverse=0;
         int copy=num;
  
         for(int i=2;i<num/2;i++){
         	if(num%i==0){
         		isPrime=false;
         		break;
         	}
         }

         if(isPrime==true){
         	
            
            while(num!=0){
         	int dig=num%10;
         	reverse=reverse*10+dig;
         	num/=10;
         }

         	if(reverse==copy){
         		System.out.println("The number is Prime Palindrome");
         	}
         	// else{
         	// 	System.out.println("The number is not Palindrome");
         	// }
         }
         else{
         	System.out.println("The number is not Prime");
         }




	}

}