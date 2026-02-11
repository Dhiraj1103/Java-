package Strings;

public class SortChars {
	
	public static String sort(String s) {
		byte ar[]=s.getBytes();
	    for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length-1-i; j++) {
				if(ar[j]>ar[j+1]) {
					byte temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}	
	    String s1=new String (ar);
	    return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="DHIRAJ";
    System.out.println(sort(s));
	}

}
