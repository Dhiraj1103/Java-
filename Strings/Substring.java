package Strings;

public class Substring {

	
	public static String substring(String s, int st, int end) {
	  String ans="";
	  for(int i=st;i<=end;i++) {
		  ans+=s.charAt(i);
	  }
	  return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dhiraj";
		System.out.println(substring(s, 3, 5));

	}

}
