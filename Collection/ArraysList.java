package Collection;
import java.util.*;
public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> cars=new ArrayList<String>();
       
      cars.add("Tata");
      cars.add("Volvo");
      cars.add("Mahindra");
      
      cars.add(0,"Ferrari");
      cars.add(0,"Subaru");
      cars.add(3, "isuzu");
      
		System.out.println("Array List size: "+cars.size());
      for (String i : cars) {
		System.out.println(i);
	}
      System.out.println("-------------------------------------------------");
      System.out.println("Get index 1: "+cars.get(1));
      System.out.println("-------------------------------------------------");
      cars.set(2, "Maruti");
      for (String i : cars) {
          System.out.println(i);

	}
      System.out.println("-------------------------------------------------------");
      cars.remove(1);
      cars.remove(0);
       for (String i : cars) {
		System.out.println(i);
	}
       System.out.println("------------------------------------------------------");
	cars.clear();
	  System.out.println("Size after: "+cars.size());
	}
	

}
