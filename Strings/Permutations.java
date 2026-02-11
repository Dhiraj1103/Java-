package Strings;
import java.util.Arrays;
public class Permutations {
	
	public static void createPermutations(char a[],int fix) {
		if(fix==a.length-1) {
		   System.out.println(a.length-1);
			System.out.println(Arrays.toString(a));
			return ;
		}
		for (int i = fix; i < a.length; i++) {
			swap(a,fix,i);
			createPermutations(a, fix+1);
			swap(a,i,fix);
		}
	}
	public static void swap(char ch[], int i , int j) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String a="abc";
      
          createPermutations(a.toCharArray(), 0);
	}

}
