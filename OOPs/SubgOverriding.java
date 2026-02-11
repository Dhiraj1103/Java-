package OOPs;

class Subg{
	String username,pass;
	public Subg() {
		// TODO Auto-generated constructor stub
	}
	Subg(String username, String pass){
		this.username=username;
		this.pass=pass;
	System.out.println("Login Successfull");	
	}
	
	int bullets=30;
	public void forward(){
		System.out.println("moved 1 step forward");
	}
	public void backward() {
		System.out.println("moved 2 step forward");
	}
	public void left() {
		System.out.println("moved 1 step left");
	}
	public void right() {
		System.out.println("moved 1 step left");
	}
     
 }
 class Subg2 extends Subg{
	 public Subg2 () {
		 
	 }
	 public void backward() {
		 System.out.println("moved 2 step backward");
	 }
	 
	 public void right() {
		 System.out.println("moved 1 step right");
	 }
 }
 
 class Subg3 extends Subg2{
	 public Subg3() {
		 
	 }
	 public void backward() {
		 System.out.println("moved 1 step backward");
	 }
	 
 }




public class SubgOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Subg3 s1=new Subg3();
       s1.forward();
       s1.backward();
       s1.left();
       s1.right();
	}

}
