package OOPs;

class Father1{
	public Father1() {
		
	}
	public void drinking() {
		System.out.println("Attal bevda ");
	}
	
}

class Son1 extends Father1{
	public Son1() {
		
	}
	public void smoking() {
		System.out.println("Ganjedi");
	}
}


public class UpcastingSon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
          Father1 s= new Son1();
          s.drinking();
          System.out.println("-------------------------------------------");
            
          Son1 s1= (Son1) s;
          s1.smoking();
       
	}

}
