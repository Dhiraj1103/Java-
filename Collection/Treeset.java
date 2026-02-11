package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<String> ts=new TreeSet<String>();
		 ts.add("Pune");
		 ts.add("Mumbai");
		 ts.add("Chennai");       
		 ts.add("Surat");       
		 ts.add("Indore");       
		 ts.add("Benguluru");
		 ts.add("Benguluru");
		 System.out.println(ts);
		
		 System.out.println("Same or above it: "+ts.ceiling("Ch"));
		 System.out.println("Same or less than it: "+ts.floor("Pun"));
		 System.out.println("Only above it: "+ts.higher("Pune"));
		 System.out.println("Only less than it: "+ts.lower("Pune"));
		 
		 System.out.println(ts.descendingSet());
		 System.out.println(ts.contains("Pune"));
		 System.out.println("---------------------------------------------------");
		 System.out.println("Remove first element: "+ts.pollFirst());
		 System.out.println(ts);
		 System.out.println("Removes last element: "+ts.pollLast());
		 System.out.println(ts);
		 System.out.println(ts.size());
		 System.out.println("---------------------------------------------------");
         System.out.println();
		 Iterator<String> itr=ts.descendingIterator();
		 System.out.println("Prints in descending order: ");
		 while (itr.hasNext()) {
          System.out.println(itr.next());			
		}
		 System.out.println(ts.descendingSet());
		 System.out.println();
		 System.out.println("Obtains subset: ");
		System.out.println(ts.subSet("Chennai",true, "Mumbai",true));
		 System.out.println(ts.tailSet("Mumbai"));
		 System.out.println(ts.last());
		
	}
	}
