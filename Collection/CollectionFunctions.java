package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class CollectionFunctions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
      a1.add(10);
    Collections.addAll(a1, 20,30,40,50,60);
      System.out.println(Collections.addAll(a2, 10,200,300,400,500));
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(Collections.disjoint(a1,a2));
		System.out.println(Collections.frequency(a1, 10));
		System.out.println(Collections.binarySearch(a1, 10));
		System.out.println(Collections.indexOfSubList(a1, Arrays.asList(40,50,60)));
		System.out.println(Collections.lastIndexOfSubList(a1, Arrays.asList(50)));
		System.out.println(Collections.min(a1));
		System.out.println(Collections.max(a1));
	System.out.println(Collections.nCopies(10, 100));
	//	System.out.println(a1);
          Collections.reverse(a1);
          System.out.println(a1);
          Collections.reverseOrder();
      System.out.println(a1);
	
	 System.out.println(Arrays.asList(10,20));
	}
	

}
