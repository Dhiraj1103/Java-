package Strings;
import java.util.Arrays;
public class RemoveDuplicates {
	
	 public static int[] count(String s) {
	  char ch[]= s.toCharArray();
	  int count=0;
	  int ct[]=new int[ch.length];
	  for(int i=0;i<ch.length;i++) {
		  if(ct[i]!=-1) {
			  for (int j = i+1; j < ch.length; j++) {
				  if(ch[i]==ch[j]) {
					  count++;
					  ct[j]=-1;
				  }
			}
		  }
	  }
	  return ct;
	}
	 
	 public static String removeDuplicate(String s) {
		 char ch1[]=s.toCharArray();
		 int ct[]=count(s);
		 int count=0;
		 for(int i=0;i<ct.length;i++) {
			 if(ct[i]==-1) count++;
		 }
		 char ch[]=new char[s.length()-count];
		 for(int i=0,j=0;i<ct.length;i++) {
			 if(ct[i]!=-1) {
				 ch[j++]=ch1[i];
			 }
				 
		 }
		 String s1=new String(ch);
		 return s1;
		 
}
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Harshwardhan";
       System.out.println(removeDuplicate(s));;
       
	}

}
