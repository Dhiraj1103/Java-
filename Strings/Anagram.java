package Strings;
import java.util.Arrays;
public class Anagram {
	public static boolean anagram(String s1, String s2) {
		if(s1.length()==s2.length()) {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			int ar1[]=new int[26];
		int ar2[]=new int [26];
		for (int i = 0; i <s1.length(); i++) {
			ar1[s1.charAt(i)-97]++;
			ar2[s2.charAt(i)-97]++;
      }
		for(int i=0,j=ar1.length-1;i<j;i++,j--) {
			if(ar1[i]!=ar2[i] ||ar1[j]!=ar2[j]) return false;
		}
		return true;
		}
		return false;
	}
	
	public static boolean anagram2(String s1, String s2) {
		if(s1.length()==s2.length()) {
			s1=s1.toLowerCase();
		    s2=s2.toLowerCase();
		    char ch1[]=s1.toCharArray();
		    char ch2[]=s2.toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    return Arrays.equals(ch1,ch2);
		 }
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="Silent";
      String s2="Listen";
      System.out.println(anagram(s1, s2));
      System.out.println(anagram2(s1, s2));
	}

}
