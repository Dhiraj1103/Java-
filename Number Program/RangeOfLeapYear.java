import java.util.Scanner;
class RangeOfLeapYear{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Start Year: ");
		int st=sc.nextInt();
		System.out.print("Enter the End Year: ");
		int end=sc.nextInt();

		while(st<=end){
           if((st%4==0 && st%100!=0) || st%400==0){
           	System.out.println(st);
           }
           st++;
		}
	}
}