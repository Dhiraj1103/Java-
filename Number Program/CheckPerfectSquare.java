import java.util.Scanner;
class CheckPerfectSquare{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();
        
        boolean isSquare=false;
		for(int i=1;i<=num/2;i++){
			if(i*i==num){
				isSquare=true;
				break;
			}

		}
		if(isSquare)
			System.out.println("The number is perfect");
		else
			System.out.println("The number is not perfect Square");
	}
}

