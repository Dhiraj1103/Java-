package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	     HashSet<Integer> hs1 =new HashSet<Integer>();
	     HashSet<Integer> hs2=new HashSet<Integer>();
	     HashSet<Character> ch=new HashSet<Character>();
	     ch.add('a');
	     ch.add('b');
	     ch.add('c');
	     ch.add('a');
	     ch.add('d');
	     
	      System.out.println(ch);
	     hs1.add(10);
	     hs1.add(20);
	     hs1.add(30);
	     hs1.add(40);
	     hs1.add(50);
	     hs2.add(50);
	     hs2.add(60);
	     hs2.add(70);
	     hs2.add(80);
	     hs2.add(90);
	     hs2.add(20);
	     hs2.add(40);
	     
	     HashSet<Integer>union = new HashSet<Integer>(hs1);
	    union.addAll(hs2);
	     System.out.println(union);
	     
	     HashSet<Integer>intersection = new HashSet<Integer>(hs1);
          intersection.retainAll(hs2);
         System.out.println(intersection); 
         
	     HashSet<Integer>diff = new HashSet<Integer>(hs1);
          diff.removeAll(hs2);
          System.out.println(diff);
	
	

	  
	}
}
