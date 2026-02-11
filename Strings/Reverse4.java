package Strings;

import java.util.Arrays;

public class Reverse4 {

	 public static void reverse(String s) {
		 String s1[]=s.split(" ");
		 for (int i = 0; i < s1.length; i++) {
			s1[i]=  Reverse2.reverse(s1[i]);
		}
		  System.out.println(Arrays.toString(s1));
}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="I! lo!ve Bharat";
      reverse(s);
	}

}
