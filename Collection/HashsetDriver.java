package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetDriver {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashSet<EmployeeComparable2> h1=new HashSet<EmployeeComparable2>();
			h1.add(new EmployeeComparable2("Mahesh","SDE",10,12,400000.0));
			h1.add(new EmployeeComparable2("Akash","Tester",20,8,400000.0));
			h1.add(new EmployeeComparable2("Rajsh","AIE",30,5,400300.0));
			h1.add(new EmployeeComparable2("Mahi","Cloud",40,7,100000.0));
			h1.add(new EmployeeComparable2("Taki","SDE",50,15,50000.0));
			h1.add(new EmployeeComparable2("Naga Arjun","SDE",60,7,600000.0));
			h1.add(new EmployeeComparable2("Siya","Tester",70,12,120000.0));
			
			for (EmployeeComparable2 i : h1) {
				System.out.println(i);
			}
			System.out.println("------------------------------------------------");
	// conversion of hashset to arraylist
		ArrayList<EmployeeComparable2> a1=new ArrayList<EmployeeComparable2>(h1);
		 a1.remove(0);
		 a1.remove(1);
		 
		System.out.println(a1.get(3));
		System.out.println("------------------------------------------------");

	//conversion of arraylist to hashset
		HashSet<EmployeeComparable2> h2 =new HashSet<>(a1);
		  for (EmployeeComparable2 i : h2) {
			  System.out.println(i);
		}
		EmployeeComparable2 e =new EmployeeComparable2("Naga Arjun","SDE",60,7,600000.0);

		  System.out.println(h2.contains(e));
		}

}
