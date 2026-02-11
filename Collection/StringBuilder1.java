package Collection;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1= new StringBuilder("Hi ");
		StringBuilder sb2= sb1.append("Bye");   //possible due to the mutable properties
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		
		String s1="Hello";
        String s2=s1.concat(" World");
		System.out.println(s1);
      	System.out.println(s2);
      	System.out.println(s1==s2); // because here the reference is different
	

	}

}
