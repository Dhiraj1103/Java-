package Strings;
public class LongestWordInSentence {
	
	public static String longestWord(String s) {
	    
         String word[]=s.split(" ");
         int max=0;
         String ans="";
         for (int i = 0; i < word.length; i++) {
			if(word[i].length()>max) {      //here i means hello one whole word
				max=word[i].length();
				ans=word[i];
			}
			System.out.println(word[i]+":"+word[i].length());
		}
		return ans;	
	}
	
	public static void longestWord2(String s) {
		String word="";
		String ans="";
		int max=0, count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				count++;
				word+=ch;
				if(count>max) {
					max=count;
					ans=word;
				}
			}
				else if(ch==' ') {
					count=0;

					word="";
				}
			}
		
		System.out.println("Word: "+ans);
		System.out.println("Length: "+max);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="Hello Good Morning";
      //  System.out.println(longestWord(s));
        longestWord2(s);
	}
}
