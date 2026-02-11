import java.util.Scanner;
class Power{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.print("Enter the base: ");
		int base=sc.nextInt();
		System.out.print("Enter the power: ");
		int power=sc.nextInt();
        int ans=1;
		for(int times=0; times<power;times++){
              ans*=base;
		}
       
       System.out.println(ans);
		}
	}
