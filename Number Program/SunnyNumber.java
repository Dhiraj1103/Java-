import java.util.Scanner;
class SunnyNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the  number: ");
		int num=sc.nextInt();
        num++;
        boolean isSunny=false;
        for(int i=1;i<=num/2;i++){
             if(i*i==num){
             	isSunny=true;
             }
        }
         if(isSunny)
         	System.out.println("The number is Sunny");
         else
         	System.out.println("The number is not Sunny");

	}
}