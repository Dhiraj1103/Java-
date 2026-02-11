package Arrays2D;
import java.util.Arrays;
import java.util.Iterator;

public class Sumof2Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},
			    {5,6,7,8},
			    {9,1,2,3},
			    {4,5,6,7}};
		
		int b[][]= {{1,2,3,4},
			    {5,6,7,8},
			    {9,1,2,3},
			    {4,5,6,7}};
		
		int sum[][]=new int[a.length][a[0].length];
		for (int i = 0; i < a.length && i<b.length; i++) {
			for(int j=0;j<a[i].length && j<b.length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for (int i = 0; i < sum.length; i++) {
			System.out.println(Arrays.toString(sum[i]));
		}
	}

}
