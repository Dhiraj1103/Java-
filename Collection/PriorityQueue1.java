package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> q1=new PriorityQueue<Integer>();
		
		q1.add(10);
		q1.add(10);
		q1.add(102);
		q1.add(110);
		q1.add(100);
		q1.add(19);
		
		q1.offer(25);  // add and offer both work same
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.peek());
		System.out.println(q1.peek());
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println(q1.poll());
		System.out.println("--------------------------------------");

		System.out.println("Element present: "+q1.contains(10));
		System.out.println();
	}

}
