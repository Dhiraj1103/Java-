package Sorting;
import java.util.Arrays;
public class MergeSortedArrays {
	
	public static int[] merge(int a[], int b[]) {
          int ans[]=new int[a.length +b.length];
		int i=0, j=0,k=0;
		while(i<a.length && j<b.length){
				if(a[i]>b[j]) {
					ans[k]=b[j];
					k++;j++;
				}
				else if(a[i]<b[j]) {
					ans[k]=a[i];
					k++;i++;
				}
			}
		while(i<a.length) {
			ans[k]=a[i];
			k++;i++;
		}
		while(j<b.length) {
			ans[k]=b[j];
			k++;j++;
		}
		return ans;
		}
	
	
	public static int[] sort(int c[]) {
		int ans[]=new int[c.length];
		int k=0;
		int i=0, mid=c.length/2,j=mid;
		while(i<j && j<c.length) {
			if(c[i]<=c[j]) {
				ans[k]=c[i];
				k++;i++;
			}
			else  {
				ans[k]=c[j];
				k++;j++;
			}
		}
		while(i<mid) {
			ans[k]=c[i];
			k++;i++;
		}
		while(j<c.length){
			ans[k]=c[j];
			k++;j++;
			
		}
	
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,8,16,21};
		int b[]= {0,5,6,11,15,25,70};
		int c[]= {3,8,16,21,5,6,11,15};
		System.out.println(Arrays.toString(merge(a, b)));
		
		System.out.println(Arrays.toString(sort(c)));


	}

}
