package Strings;
import java.util.Arrays;
public class SumOfNumberString {
	
	public static void sum(String s) {
		byte ar[]=s.getBytes();
	  	System.out.println(Arrays.toString(ar));
	  	int sum=0;
	  	for (int i = 0; i < ar.length; i++) {
			if(ar[i]>=49 && ar[i]<=57) {
				sum+=ar[i]-48;
				}
		}
	  	System.out.println(sum);
	}
	public static void main(String[] args) {
		
		String s="1jkh3khjj2kl5bj";
		sum(s);
	}

}
