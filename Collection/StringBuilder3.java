package Collection;

public class StringBuilder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String s="Hello ";
		s=s+"Dhiraj ";     //s = new StringBuilder(s).append("world").toString();
		StringBuilder s2= new StringBuilder(s);
		
		s2.append("How are you?");
		s2.append(1);
		String s3= new String (s2);
	   System.out.println(s3);
	   
	   StringBuilder s5=new StringBuilder(s3);
	   s5.replace(0, 5,"Hi");
	   String s6=new String(s5);
	   System.out.println(s6);
	   
	   System.out.println(s6.replace("Hi", "Hello"));
	}

}
