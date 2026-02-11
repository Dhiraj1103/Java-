package Arrays2D;
import java.util.Arrays;

public class Reverse2DArrays {
    
	public static void reverse(int a[]) {
		for (int i = 0,j=a.length-1; i < j; i++,j--) {
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},
			    {5,6,7,8},
			    {9,1,2,3},
			    {4,5,6,7}};
		
		for (int i = 0; i < a.length; i++) {
			reverse(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

}
