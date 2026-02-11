package Strings;

public class VowelsConsonants {
	public static void vowelConsonant(String s) {
		
	String vowel="";
	String consonant="";
	char ch[]=s.toCharArray();
     for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||
				ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') 
			vowel=vowel+ch[i];
		
		else consonant+=ch[i];
	}
     System.out.println("The vowels of "+ s+" are:"+vowel);
     System.out.println("The consonants of "+s+" are:"+consonant);

}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Dheeraj";
        vowelConsonant(s);
	}

}
