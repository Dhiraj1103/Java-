package OOPs;

class Father{
	double height;
	int age;
	String name;
	String color;
	
	public Father() {
		// TODO Auto-generated constructor stub
	}
	public Father(double height, int age, String name,String color) {
		this.height=height;
		this.age=age;
		this.name=name;
		this.color=color;
	}
	
}

class Son extends Father{
	double height;
	int age;
	String name;
	String color;
	
 public Son(double height,int age, String name,String color) {
	// TODO Auto-generated constructor stub
	 super(height, age, name,color);
	
}
 public Son() {
	 
 }

   public void display() {
	   System.out.println("Father name: "+super.name);
	   System.out.println("Son name: "+name);
	   System.out.println("Father Height: "+super.height);
	   System.out.println("Son Height: "+height);
	   System.out.println("Father Color: "+super.color);
	   System.out.println("Son Color: "+color);

	   }
}

public class FatherSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f= new Father(5.6, 55 , "Ramesh", "Black");

		Son s1= new Son(5.5,22,"Dhiraj","White");
		s1.display();
		System.out.println(s1 instanceof Son);
		System.out.println(s1 instanceof Father);
		
		System.out.println(s1.getClass());
		

	}

}
