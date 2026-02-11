package NonPrimitiveArrays;

public class User {
	
	String name, boarding, destination, email;
    int age, seaters;
    long phno;
    char gen;
    public User() {
    	
    }

	public User(String name, String boarding, String destination, String email,char gen, int age, long phno, int seaters) {
		super();
		this.name = name;
		this.boarding = boarding;
		this.destination = destination;
		this.email = email;
		this.age = age;
		this.phno = phno;
		this.gen=gen;
		this.seaters=seaters;
	}
    public void displayUser() {
    	System.out.println("Name: "+name);
    	System.out.println("Boarding: "+boarding);
    	System.out.println("Destination: "+destination);
    	System.out.println("Email: "+email);
    	System.out.println("Age: "+age);
    	System.out.println("Gen: "+gen);
    	System.out.println("Phone number: "+phno);
    	System.out.println("Seaters: "+seaters);
   System.out.println("--------------------------------------------------------------------");
    }
    
    public String toString() {
    	return "[Name: "+name+" ,Gen: "+gen+"]";
    }
    
}
