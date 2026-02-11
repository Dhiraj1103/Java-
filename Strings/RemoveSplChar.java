package Strings;

public class RemoveSplChar {
	
	public static String remove(String s) {
		String ans="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='A' && s.charAt(i)<='Z'|| s.charAt(i)>='1' && s.charAt(i)<='9') {
				ans+=s.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dh#ir$aj@123";
		System.out.println(remove(s));
		
		

	}

}
