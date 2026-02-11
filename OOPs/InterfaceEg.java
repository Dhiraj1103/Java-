package OOPs;

interface Shape{
    double PI_Value=22.0/7.0;	
     
    double areaOfCircle(int rad);
    double circumferenceOfCircle(int rad);
   public static void message() {
    	System.out.println("From interface");
    }
}

class Calculations implements Shape{
	public double areaOfCircle(int rad) {
		return PI_Value*(rad*rad);
	}
	public double circumferenceOfCircle(int rad) {
		return 2*PI_Value*(rad*rad);
	}
	
	public static void mesaage() {
		System.out.println("From class");
	}
	public void message2() {
		System.out.println("From class 2");
	}
}




public class InterfaceEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shape s1 = new Calculations();
        System.out.println( s1.areaOfCircle(6));
      System.out.println( s1.circumferenceOfCircle(6));
       Shape.message();
	}

}
