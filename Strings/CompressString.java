package Strings;

public class CompressString {
	
	public static String compress(String s) {
		int count=1;
		String ans="";
		for (int i = 0,j=i+1; i < s.length(); ) {
	     if( j<s.length() &&s.charAt(i)==s.charAt(j) ) {
				count++;
			    j++;
			}
		else {
			ans=ans+s.charAt(i);
			ans=ans+count;
			i=j;
			count=1;
			j=i+1;
		}
	}
		return ans;
	}
	
	 public static String compress(char[] ch) {
	        String s=new String(ch);
	        int count=1;
	        String ans="";
	        for(int i=0,j=i+1;i<s.length() ;){
	            if(s.length()==1){
	             return ans;
	            }
	          else if(j<s.length() && s.charAt(i)==s.charAt(j)){
	                count++;
	                j++;
	            }
	           
	            else{
	                ans=ans+s.charAt(i);
	                ans+=count;
	                i=j;
	                j=i+1;
	                count=1;
	            }
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String s="aaaaaaadddbbbbcccc";
		char ch[]={'a','b','b','b','b','b','b','b','b','b'};
		System.out.println(compress(s));
		System.out.println(compress(ch));
	}

}
