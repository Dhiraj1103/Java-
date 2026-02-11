// //using while loop
// import java.util.Scanner;
// class Countingdigits{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
//          System.out.print("Enter the number: ");
// 		int num=sc.nextInt();
// 		int count=0;
// 		while(num!=0){
//             count++;
//             num/=10;
// 		}
// 		System.out.println(count);
// 	}
// }

// //using string
// import java.util.Scanner;
// class Countingdigits{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
//          System.out.print("Enter the number: ");
// 		int num=sc.nextInt();
// 		String str=num+"";
// 	   int count=str.length();
// 		System.out.println(count);
// 	}
// }

//using log function
import java.util.Scanner;
class Countingdigits{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();

		int result=(int)Math.log10(num)+1;
		System.out.println(result);
	}
}