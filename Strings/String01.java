package Strings;

public class String01 {
	public static String convert(String s) {
	      byte num[]=s.getBytes();
			 byte num1[]=new byte[num.length];
         String res="";
	      for(int i=0;i<num.length;i++) {
	    	  if(num[i]>=48 && num[i]<=53)
	    		  res+=0;
	    	  else if(num[i]>=54 && num[i]<=57) res+=1;
	      }
	      return res;
	        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="123456789";
          System.out.println("01011110001100111");
          System.out.println(convert(s));
	}

}
