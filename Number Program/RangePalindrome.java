import java.util.Scanner;
class RangePalindrome{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

			System.out.print("Enter the Start: ");
			int st=sc.nextInt();

			System.out.print("Enter the End: ");
			int end=sc.nextInt();

			int copy=st;
             int reverse=0;
			while(st<=end){
				while(st!=0){
					reverse=reverse*10+(st%10);
					st/=10;
				}
				if(copy==reverse){
				System.out.print(reverse+" ");
			}
				st++;
			}
			

		}
	}
