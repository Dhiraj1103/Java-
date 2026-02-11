package Arrays2D;
import java.util.Arrays;

public class Productof2Matrix {

	public static int[][] product(int a[][], int b[][]){
		if(a[0].length==b.length) {   //check col and row are same
			int c[][]=new int [a.length][b[0].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					int sum=0;
					for (int k = 0; k < b.length; k++) {
						sum+=a[i][k]*b[k][j];
					}
					c[i][j]=sum;
				}
			}
			return c;
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},      //4X4
			    {5,6,7,8},    
			    {9,1,2,3},
			    {4,5,6,7}};
		//cols == rows
		int b[][]= {{1,2},      //4X2
			        {5,6},
			        {9,1},
			        {4,5}};
			   
		int ans[][]=product(a,b);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(Arrays.toString(ans[i]));
		}
		
	}

}
