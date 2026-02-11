package Strings;

public class Reverse2 {

	public static String reverse(String s) {
     char a[]=s.toCharArray();
     int st=0,end=a.length-1;
     while(st<end) {
    	 if(!(a[end]>='a' && a[end]<='z' || a[end]>='A' && a[end]<='Z') )      end--;
       	 else if(!(a[st]>='a' && a[st]<='z' || a[st]>='A' && a[st]<='Z') )   st++;
   	 	 else {
    		 char temp=a[st];
    		 a[st]=a[end];
    		 a[end]=temp;
    		 st++;end--;

    	 }
     }
     String s1=new String(a);
     return s1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Ni@te_sh$";
       System.out.println("ni@te_sh$");
       System.out.println(reverse(s));
	}

}
