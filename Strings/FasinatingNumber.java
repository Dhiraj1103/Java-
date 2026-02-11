package Strings;

import java.util.Arrays;

public class FasinatingNumber {
	
	public static boolean contains(String s, char ch) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==ch) return true;
		}
		return false;
	}
	
	
	public static boolean isFasinating(int num) {
		String number=num+" "+(num*2)+" "+(num*3);
		for(int i=1;i<=9;i++) {
			if(!contains(number,(char)(i+'0'))) return false;
		}
		return true;
	}
	
		
		public static boolean fasinating(int a) {
			String ans=""; 
			for (int i = 1; i <=3; i++) {
				ans=ans+(a*i);
			}
		   int sum=0;
		   for (int i = 49; i <=57; i++) {
			 sum+=i;
		}
		   byte a1[]=ans.getBytes();
		   int sum2=0;
		   for (int i = 0; i < a1.length; i++) {
			  sum2+=a1[i];
		}
		  
		   return sum2==sum;
		   
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isFasinating(192));
		System.out.println(fasinating(192));

	}

}
