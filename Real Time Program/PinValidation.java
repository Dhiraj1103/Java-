import java.util.Scanner;
class PinValidation{
	public static void main(String[] args)
	throws InterruptedException
	 {
		Scanner sc=new Scanner(System.in);
         
         int oldPin=1234;
         int milliSec=2000;


        outerloop:
         for(; ; ){
           int attempt=3;
		do{
			System.out.print("Enter you pin: ");
		    int newPin= sc.nextInt();

		    if(newPin==oldPin){
		    	System.out.println("Phone is unlocked");
		    	break outerloop;
		    }
		    else{
		    	System.out.println("Invalid Pin");
		        System.out.println("Attempt left: "+ (attempt-1));
		    }

               attempt--;
		}
		while(attempt>=1);
		System.out.println();
		System.out.println("Phone is Disabled for "+(milliSec/1000)+"seconds");
		Thread.sleep(milliSec);
		milliSec*=2;
	}
}
}