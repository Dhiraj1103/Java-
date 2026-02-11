package OOPs;

class Student8{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		try {
		if(age<=0) {
			throw new IllegalArgumentException("Age must be Positive");
		}
			this.age=age;
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}



public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student8 s= new Student8();
     s.setName("Dhiraj");
     s.setAge(22);
     
     System.out.println(s.getName());
     System.out.println(s.getAge());
     
     s.setAge(-5);
    
     Student8 s1=s;
     
     System.out.println(s1.getAge());
     System.out.println(s);
     System.out.println(s1);
     
     
	}

}
