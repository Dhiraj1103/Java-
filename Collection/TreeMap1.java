package Collection;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
       
       hm.put(1,"Dhiraj");
       hm.put(2, "Shriraj");
		 hm.put(3, "Anujay");
		 hm.put(4, "Priyanshu");
		 hm.put(5, "Priyanshu");
		 

         System.out.println(hm.remove(5));
         System.out.println(hm.putIfAbsent(6, "Ram"));
         System.out.println(hm.remove(6, "Ram"));
         System.out.println(hm.replace(3, "Aarti"));
       System.out.println(hm.ceilingEntry(1));
       System.out.println(hm.ceilingEntry(2));
       System.out.println(hm.containsKey(1));
       System.out.println(hm.containsValue("Shriraj"));
       System.out.println(hm.descendingKeySet());
       System.out.println(hm.descendingMap());
       System.out.println(hm.entrySet());
       System.out.println(hm.firstEntry());
       System.out.println(hm.firstKey());
       System.out.println(hm.floorKey(4));
       System.out.println(hm.floorEntry(4));
       System.out.println(hm.headMap(3));
       System.out.println(hm.higherKey(3));
       System.out.println(hm.higherEntry(2));
       System.out.println(hm.lastEntry());
       System.out.println(hm.lastKey());
       System.out.println(hm.tailMap(3));
       System.out.println(hm);
System.out.println();
       System.out.println(hm.pollFirstEntry());
       System.out.println(hm.pollLastEntry());
       
       
           System.out.println(hm);
}
}