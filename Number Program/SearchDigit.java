import java.util.Scanner;
class SearchDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          System.out.println();

          int num=416562;
		System.out.println(num);
		System.out.println();
		System.out.println("Enter the number: ");
        int num1=sc.nextInt();
		boolean numberFound=false;

		while(num!=0){
			int dig=num%10;
			if(num1==dig){
				numberFound=true;
				break;
			}
			num/=10;
		}
		if(numberFound==true){
			System.out.println("The number is Present");

		}
		else{
			System.out.println("The number is not present");
		}
	}
}