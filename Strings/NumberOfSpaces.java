package Strings;

public class NumberOfSpaces {
	public static int countchar(String s) {
		char ch[]=s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ') count++;
		} 
		return count;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Happy birthday to you";
		System.out.println("Count of Char is: "+countchar(s));

	}

}
