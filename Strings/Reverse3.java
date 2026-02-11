package Strings;
import java.util.*;
public class Reverse3 {

	 public static void reverse(String s) {
		 String s1[]=s.split(" ");
		  System.out.println(Arrays.toString(s1));

		 for (int i = 0; i < s1.length; i++) {
			s1[i]=  reverse1(s1[i]);
		}
		  System.out.println(Arrays.toString(s1));

	 }
	 
	 public static String reverse1(String s) {
		
		 String rev="";
		 for (int i = 0; i < s.length(); i++) {
			 rev=s.charAt(i)+rev;
	}
		 return rev;
	 }
	 
		public static String extract(String s) {
			String ans="";
			String words[]=s.split(" ");
	           for (int i = 0; i < words.length; i++) {
			    ans+=	reverse2(words[i])+" ";
			}
	           return ans; 
			}
			
		public static String reverse2(String s) {
			String rev="";
			for (int i =s.length()-1; i >=0; i--) {
				rev+=s.charAt(i);
			}
			return rev;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="I love Bharat";
      reverse(s);
       System.out.println(extract(s));
	}

}
