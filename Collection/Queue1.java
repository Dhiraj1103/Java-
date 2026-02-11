package Collection;
import java.util.*;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Queue<Integer> q=new LinkedList<>();
       q.add(10);
       q.add(20);
       q.add(30);
       System.out.println(q);
       q.add(40);
       q.add(50);
       System.out.println(q);
  
      System.out.println("Removed from start: "+q.remove());
       System.out.println(q);
       System.out.println("Peeking: "+q.peek());
       System.out.println("Size: "+q.size());
       
       
       

	}

}
