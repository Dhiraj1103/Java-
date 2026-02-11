package Strings;
import java.util.Arrays;
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String s="Harshvardhan";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("Number of characters in the words: "+s.length());
		System.out.println("ASCII value is: "+s.codePointAt(0));
		System.out.println("ASCII value is: "+s.codePointBefore(4));
		System.out.println("Compare ABC to abc: "+"ABC".compareTo("abc"));
		System.out.println("Compare ABC to abc ignore case: "+"ABC".compareToIgnoreCase("abc"));
		System.out.println("Convert to uppercase: "+s.toUpperCase());
       System.out.println("Convert to lowercase: "+s.toLowerCase());
       
       char ch[]=s.toCharArray();
       System.out.println("Stored in char arrays: "+Arrays.toString(ch));
       
       byte ch1[]=s.getBytes();
       System.out.println("Stored in ASCII values: "+Arrays.toString(ch1));
       
       System.out.println("Hi".concat("bye"));
       System.out.println("Does Harshvardhan contains vardhan: "+s.contains("vardhan"));
       System.out.println("Does Harshvardhan starts with Harsh: "+s.startsWith("Harsh"));
       System.out.println("Does Harshvardhan starts with dhan: "+s.endsWith("dhan"));
       System.out.println("This would lead to blank space: "+s.indent(6));
       System.out.println("The index of a is: "+s.indexOf('a'));
       System.out.println("The index of second a is: "+s.indexOf('a', 4));
       System.out.println("The index of dhan starts from: "+s.indexOf("dhan"));
       System.out.println("Is there a blank space: "+"   ".isBlank());
       System.out.println("Is the string empty: "+"".isEmpty());
       System.out.println(s.lastIndexOf("han"));
       System.out.println("Repeating a for 10 times: "+"a".repeat(10));
       System.out.println("Replace a with o: "+s.replace('a', 'o'));
       System.out.println("Replace Harsh with Marco: "+s.replace("Harsh", "shet"));
       
       String s2="I love Bharat";
       String split[]=s2.split(" ");
       System.out.println("Here Split using space: "+Arrays.toString(split));
       System.out.println("Remove spaces from start: "+"       Dhiraj       ".strip());
       System.out.println("Remove spaces from start: "+"       Dhiraj       ".stripIndent());
       System.out.println("Remove spaces from start: "+"       Dhiraj       ".stripLeading());
       System.out.println("Remove spaces from end: "+"       Dhiraj       ".stripTrailing());
       System.out.println("Print the word after index 3: "+s.substring(3));
       System.out.println("Print the word between index 3 and 7: "+s.substring(3, 7));
       
       char ch2[]= {'D','h','i','r','a','j'};
       String s3 =new String (ch2);
       System.out.println("Convert char 'D','h','i','r','a','j' to Dhiraj: "+s3);

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
