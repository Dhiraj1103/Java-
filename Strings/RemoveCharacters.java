package Strings;

public class RemoveCharacters {
	
	public static String removeChar(String s, char c) {
		
		char ch[]=s.toCharArray();
		char ans[]=new char[ch.length];
		for(int i=0,j=0;i<ch.length;i++) {
			if(ch[i]!=c)
				ch[j++]=ch[i];
		}
		String s2= new String(ans);
		return s2;
	}
	public static String removeChar2(String s, char c) {
		String res=s.replace("i","");
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dhiraj";
		System.out.println(removeChar(s, 'i'));
		System.out.println(removeChar2(s, 'i'));
		

	}
	
	

}
