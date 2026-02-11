package Arrays2D;

import java.util.Iterator;

public class SumofDiagonalElement {
	
	public static int leftDiagonal(int a[][]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j) 	sum+=a[i][j];
			}
		}
		return sum;
	}
	
	public static int rightDiagonal(int a[][]) {
		int sum=0;
		int n=a.length;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i+j==n-1)     sum+=a[i][j];
	      }
	 }
		return sum;
		
	}
	
	public static int borderElements(int a[][]) {
		int sum=0;
		int n=a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==0||j==0||i==n-1||j==n-1) sum+=a[i][j];
			}
		}
		return sum;
	}
	
	public static void seperateArray(int a[][]) {
	  for (int  i= 0;  i< a.length; i++) {
		  int sum=0;

		for (int j = 0; j < a[i].length; j++) {
			sum+=a[i][j];
		}
		System.out.println("Row "+i+" sum is "+sum);
	}
	  
	}
	
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},
				    {5,6,7,8},
				    {9,1,2,3},
				    {4,5,6,7}};
	//	System.out.println(leftDiagonal(a));
		//System.out.println(rightDiagonal(a));
		System.out.println(borderElements(a));
           seperateArray(a);
	}

}















