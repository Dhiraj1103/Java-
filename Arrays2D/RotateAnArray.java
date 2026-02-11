package Arrays2D;

import java.util.*;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[][]= {{1,2,3,4},
			     {5,6,7,8},
			     {9,1,2,3},
			     {4,5,6,7}};
      for (int i = 0; i < a.length; i++) {
  		System.out.println(Arrays.toString(a[i]));
  	}
      
    
      int r[][]=reverse(a);
      
      System.out.println("Rotate 90 Degree");

     System.out.println();
     for (int i = 0; i < r.length; i++) {
		System.out.println(Arrays.toString(r[i]));
	}
	}
	//transpose
	public static int[][] transpose(int a[][]){
		   for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i<j) {
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}}	}
			return a;
    }
	//reverse
	public static int[][] reverse(int a[][]){
		int t[][]=transpose(a);
		for (int i = 0; i < t.length; i++) {
			int st=0,end=t[i].length-1;
				while(st<end) {
					int temp=t[i][st];
					t[i][st]=t[i][end];
					t[i][end]=temp;
					st++;end--;
}
	}
		return t;
		}
}





















