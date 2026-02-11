package Strings;

public class DecompressString {

  public static String decompress(String s) {
	  String ans="";
	  char temp='\u0000'; //a
	  int num=0; //2
	  for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z') {
			temp=ch;
		}
		else if(ch>='0' && ch<='9') {
			num=num*10+(ch-48);
		}
		if((i+1<s.length()) && (s.charAt(i+1)>='a' && s.charAt(i+1)<='z')) {
			ans=ans+repeat(num, temp);
			num=0;
		}
	}
	  ans=ans+repeat(num, temp);
    return ans;
  }
  
  public static String repeat(int num, char ch) {
	  String s="";
	  for (int i = 0; i <num; i++) {
		s=s+ch;
	}
	  return s;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="a21b3c2";
      System.out.println(decompress(s));
	}

}
