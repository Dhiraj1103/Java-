// import java.util.Scanner;
// class ExtractFirstNum{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);

// 		System.out.print("Enter the number: ");
// 		int num=sc.nextInt();

// 		while(num>=10){                 //546>=10-->False
// 			                            //54>=10-->False
// 			                            //5>=10-->True  hence num extracted

			
// 			num/=10;
// 		}
// 		System.out.print(num);
// 		System.out.println();
// 		String ans=(num%2==0)?("The number is Even Number"):("The number is Odd Number");
// 		System.out.println(ans);
// 	}
// }


import java.util.Scanner;
class ExtractFirstNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();

		while(num>=10){                 //546>=10-->False
			                            //54>=10-->False
			                            //5>=10-->True  hence num extracted

			num%=10;
			
		}
		System.out.print(num);
		System.out.println();
		String ans=(num%2==0)?("The number is Even Number"):("The number is Odd Number");
		System.out.println(ans);
	}
}