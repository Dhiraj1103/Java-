package Strings;

public class StringEncoding {
	
	public static String encode(String a) {
		char ch[]=a.toCharArray();
		String ans="";
		int count=1;

		for (int i = 0, j=i+1; i < ch.length && j<ch.length; ) {
			if(ch[i]==ch[j]) {
				count++; 
				j++;
			}
			else  {
				ans=ans+ch[i]+count;
				
			i=j;
			j=i+1;
			count=1;
			}
       }
	     ans = ans + ch[ch.length - 1] + count;
		return ans;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="aaacddeeefff";
         System.out.println(encode(s));
         String s2="a3d2e3f3";
	}

}
