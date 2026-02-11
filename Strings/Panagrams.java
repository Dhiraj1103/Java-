package Strings;

public class Panagrams {
	
	public static boolean panagram(String s) {
		s=s.toLowerCase();
	  int ar[]=new int[26];
	  for (int i = 0; i < s.length(); i++) {
	
		if(s.charAt(i)>='a' && s.charAt(i)<='z') ar[s.charAt(i)-97]++;
		}
	  for (int i = 0; i < ar.length; i++) {
		if(ar[i]==0) return false;
	}
	  return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The quick brown fox jumps over the lazy dog";
		System.out.println(panagram(s));

	}

}
