package Strings;
public class ReverseString {
	public static String reverse(String s) {
        String rev="";
        
        for (int i = 0; i < s.length(); i++) {
        	 rev=s.charAt(i)+rev;
		}
        return rev;
	}
      	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="racecar";
        System.out.println(reverse(s));

	}

}
