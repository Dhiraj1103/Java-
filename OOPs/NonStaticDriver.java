package OOPs;
import java.util.Scanner;
class Bottle{
	String name="Cello";
	double price;
	int ip;
	{
	Scanner sc=	new Scanner(System.in);
	System.out.println("Enter the Capacity: ");
	 ip=sc.nextInt();
  }
	{
		if(ip<500)
			price=100;
		
	
	else if(ip==500)
			price=150;
	
	
	else if(ip>500)
			price=200;
	}
	
	public void display() {
	System.out.println(name);
	System.out.println(price);
	}
}

public class NonStaticDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bottle b1=new Bottle();
        b1.display();
	}

}
