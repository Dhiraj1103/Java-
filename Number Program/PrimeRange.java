import java.util.Scanner;
class PrimeRange{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter start: ");
		int start=sc.nextInt();
		System.out.print("Enter end: ");
		int end=sc.nextInt( );

		while(start<=end){
			int den=2;
			while(den<start){
				if(start%den==0){
					break;
				}
				den++;
			}
			if(start==den){
				System.out.println(start);

			}
			start++;
		}
	}
}