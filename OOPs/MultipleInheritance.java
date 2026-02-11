package OOPs;

interface Father3{
	
	int per=95;
	void degree();
	 public static void message() {
		 System.out.println("Accha Padho");
	 }
	
}
interface Mother{
	int per=90;
	void degree();
	public static void message() {
		System.out.println("Pappa ka sunno");
	}
}
 
class Son2 implements Father3, Mother{
	public void degree() {
		System.out.println("I will Degree in BTech");
	}
	public static void message() {
System.out.println("Hello parents");
}
}



public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Father3 s1= new Son2();
       s1.degree();
       Father3.message();
	}
}

