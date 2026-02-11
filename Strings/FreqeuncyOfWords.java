package Strings;
import java.util.Arrays;
public class FreqeuncyOfWords {

	public static void freqeuncy(String s) {
		String s1[]=s.split(" ");
	
		boolean visited[]=new boolean[s1.length];
		
		for (int i = 0; i < s1.length; i++) {
			if(visited[i]) continue;
		int count=1;
		
		for (int j = i+1; j < s1.length; j++) {
           if(s1[i].equalsIgnoreCase(s1[j]))	{
        	   count++;
        	   visited[j]=true;
           }
		}
			System.out.println(s1[i]+":"+count);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello Dhiraj Hello Dhiraj are you present Hello please call me Dhiraj";
		freqeuncy(s);

	}

}
