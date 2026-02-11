package Strings;

public class SegregateUpperLower {
	public static void upperLower(String s) {
		String upper="",lower="";
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') upper+=ch[i];
			else lower+=ch[i];
		}
		System.out.println("Uppercase: "+upper);
		System.out.println("Lowercase: "+lower);
		
		
	}
	
	public static void seperate(String s) {
		String upper="",lower="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') upper+=s.charAt(i);
			else lower+=s.charAt(i);
		}
		System.out.println("Uppercase: "+upper);
		System.out.println("Lowercase: "+lower);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="DhiRaj";
      upperLower(s);
      seperate(s);
	}

}
