package Strings;

public class CountWords {
      public static int countchar(String s) {
		 String s2[]=s.split(" ");	
		 int count=0;
			for (int i = 0; i < s2.length; i++) {
			   count++;
			}
			return count;
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s="Happy birthday to you";
			System.out.println("Count of Char is: "+countchar(s));

		}

	}



