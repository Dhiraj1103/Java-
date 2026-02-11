package Strings;

public class NumberOfChars {
	
	public static int countchar(String s) {
		char ch[]=s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z' ||ch[i]>='A' && ch[i]<='Z') count++;
		}
		return count;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="D1h2i3333r4a56j32";
		System.out.println("Count of Char is: "+countchar(s));

	}

}
