package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> d=new ArrayDeque<Integer>();
         
		d.add(10);
		d.addFirst(20);
		d.addFirst(1);
		d.addLast(1);
		System.out.println(d);
		System.out.println(d.contains(2));
		System.out.println(d.element());
		d.removeFirstOccurrence(1);
		System.out.println(d);
	}

}
