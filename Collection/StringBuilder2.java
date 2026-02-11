package Collection;

public class StringBuilder2 {
	
	public static boolean compare(StringBuilder sb1, StringBuilder sb2) {
		if(sb1.compareTo(sb2)>0 || sb1.compareTo(sb2)<0) return false;
	  return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb1= new StringBuilder("Hi");
		StringBuilder sb2= new StringBuilder("Hi");
	
		System.out.println(sb1.compareTo(sb2));
		System.out.println(compare(sb1, sb2));
		System.out.println(sb1==sb2);   // because here the reference is different
		
		
		System.out.println("String 1 Hashcode:"+sb1.hashCode());
		System.out.println("String 2 Hashcode: "+sb2.hashCode());
		System.out.println(sb1.equals(sb2));
		
		
		System.out.println("--------------------------------");
		System.out.println("String below");
		String s1="Hi";
		String s2="Hi";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
	} 

}
