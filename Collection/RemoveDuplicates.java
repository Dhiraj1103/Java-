package Collection;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<Integer> a=new ArrayList<Integer>();
		 a.add(10);
		 a.add(10);
		 a.add(102);
		 a.add(102);
		 a.add(10);
		 a.add(101);
		 System.out.println(a);
		 ArrayList<Integer> a2= new ArrayList<Integer>();
		 for (Integer i : a) {
			if(!a2.contains(i)) a2.add(i);
		}
		 System.out.println(a2);
		
	}

}
