package Collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<Integer, String> hm=new HashMap<>();
		 hm.put(1, "Dhiraj");
		 hm.put(2, "Shriraj");
		 hm.put(3, "Anujay");
		 hm.put(4, "Priyanshu");
		 hm.put(5, "Priyanshu");
		 System.out.println(hm);
		  
		 Set<Integer> keys=hm.keySet();  //keys must be unique so set
		 System.out.println(keys);
		 
		 System.out.println("For particluar index: "+hm.get(2));
		 
		 System.out.println("For each");
		 for (Integer i : keys) {
			System.err.println(hm.get(i));
		}
		 
		 Collection<String> values=hm.values();  //values can be duplicate so collection
		 System.out.println(values);
		 
		
	
		 
		 Set<Map.Entry<Integer, String>> entry =hm.entrySet(); //getting all key and value inside a set
		 System.out.println(entry);
		 System.out.println();
		 
		 System.out.println("For is 2: ");
		 for (Map.Entry<Integer, String> i : entry) {    // this is done to iterate
			System.out.println(i);
		}
		// this is done to iterate
		    Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
			Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
		    while (itr.hasNext()) {
		        Map.Entry<Integer, String> entry1 = itr.next();
		        Integer key = entry1.getKey();
		        String value = entry1.getValue();
		        System.out.println("Key: " + key + ", Value: " + value);
		    }
			

		 
	}

}
