package Strings;

import java.util.Arrays;

public class ConvertStrToChar {
	public static void convert1(String s) {
		 char ch[]=s.toCharArray();
	       System.out.println(Arrays.toString(ch));   
	}
	public static void convert2(String s) {
		char ch[]=new char [s.length()];
		
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="Dhiraj";
		 convert1(s);
		 convert2(s);

	}

}
