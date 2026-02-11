package Sorting;
import java.util.Arrays;
public class MergeSort {
	public static void merge(int a[], int st, int mid,int end) {
		int ans[]=new int[a.length];
		int i=st, j=mid+1,k=st;
		while(i<=mid && j<=end) {
			if(a[i]<=a[j]) {
				ans[k++]=a[i++];
				}
			else {
				ans[k++]=a[j++];
			}
		}
		while(i<=mid) {
			ans[k++]=a[i++];
		}
		while(j<=end) {
			ans[k++]=a[j++];
		}
		
		for(int k2=st; k2<=end;k2++) {
			a[k2]=ans[k2];
		}
	}
	public static void mergeSort(int a[], int st, int end) {
		if(st<end) {
			int mid=(st+end)/2; //3
			mergeSort(a, st, mid);
			mergeSort(a, mid+1, end);
			merge(a, st, mid, end);
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,5,4,3,2,1};
	    mergeSort(a, 0, a.length-1);
	    System.out.println(Arrays.toString(a));
		

		
		


	}

}
