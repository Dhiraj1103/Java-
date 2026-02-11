package Collection;

import java.util.ArrayList;

public class MergeNoDupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(70);
		a2.add(50);
		a2.add(80);
		
		for (Integer i : a2) {
			if(!a.contains(i)) a.add(i);
			
		}
		System.out.println(a);
		
		
	}

}
