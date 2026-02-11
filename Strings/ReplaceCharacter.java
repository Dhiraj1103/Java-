package Strings;

public class ReplaceCharacter {
	
	public static String replace(String s, char old, char new1) {
		char ch[]=s.toCharArray();
	    
	    for (int i = 0; i < ch.length; i++) {
			if(ch[i]==old) {
				
				ch[i]=new1;
			}
			else ch[i]=ch[i];
         }
	    String s1=new String(ch);
	    return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dhiraj";
		System.out.println(replace(s, 'i', 'e'));

	}

}
