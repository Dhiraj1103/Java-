package Strings;


public class ConvertToUpperCase {
	
	public static String upperCase2(String s) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z') ans=ans+(char)(ch-32);
			else ans=ans+ch;
			}
		return ans;
	}

	public static String upperCase(String s) {
		byte ar[]=s.getBytes();
		byte ans[]=new byte[ar.length];
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>='a' &&ar[i]<='z') {
				ans[i]=(byte)(ar[i]-32);
			}
			else {
				ans[i]=ar[i];
			}
		}
		String s1=new String(ans);
		return s1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="India is bEautiful country";
     System.out.println(upperCase(s));
     System.out.println(upperCase2(s));

	}
}
