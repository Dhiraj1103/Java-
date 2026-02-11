package Strings;

public class RotateString {
	
	public static String rotateStringLeft(String s) {
		char ch[]=s.toCharArray();
		char temp=ch[0];
		for (int i = 0; i < ch.length-1; i++) {
			ch[i]=ch[i+1];
			}
		ch[ch.length-1]=temp;
		String s1=new String(ch);
		return s1;
	}
	public static String rotateAll(String s) {
		
		for (int i = 0; i < s.length()-1; i++) {
			s=rotateStringLeft(s);
		}
		return s;
	}
	public static String rotateStringRight(String s) {
		char ch[]=s.toCharArray();
		char temp= ch[ch.length-1];
		for (int i = ch.length-1; i >0 ; i--) {
			ch[i]=ch[i-1];
			}
		ch[0]=temp;
		String s1=new String(ch);
		return s1;
	}
	
	
	
	public static void main(String[] args) {
		String s="Dhiraj";
     //  System.out.println(rotateStringRight(s));
      // System.out.println(rotateStringLeft(s));
		System.out.println(rotateAll(s));
	}

}
