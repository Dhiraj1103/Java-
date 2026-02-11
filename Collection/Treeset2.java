package Collection;

import java.util.Comparator;
import java.util.TreeSet;

import Collection.EmployeeComparable;

public class Treeset2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This the traditional old method use for comparison
       Comparator<EmployeeComparable> c= new Comparator<EmployeeComparable>() {
		
		
		public int compare(EmployeeComparable o1, EmployeeComparable o2) {
			// TODO Auto-generated method stub
			if(o1.id>o2.id) return -1;
			return 0;
		}
	};
	//Its the new modern technique used to compare
	Comparator<EmployeeComparable> c2= (o1, o2) -> o1.name.compareTo(o2.name);
	Comparator<EmployeeComparable> c3=(e1, e2) -> e1.sal>e2.sal?1:(e1.sal<e2.sal?-1:0);
	
	TreeSet<EmployeeComparable> db =new TreeSet<EmployeeComparable>(c3);
	db.add(new EmployeeComparable("Mahesh","SDE",10,12,400000.0));
	db.add(new EmployeeComparable("Akash","Tester",20,8,400000.0));
	db.add(new EmployeeComparable("Rajsh","AIE",30,5,400300.0));
	db.add(new EmployeeComparable("Mahi","Cloud",40,7,100000.0));
	db.add(new EmployeeComparable("Mahi","Cloud",40,7,100000.0));
	db.add(new EmployeeComparable("Mahi","Cloud",40,7,100000.0));
	db.add(new EmployeeComparable("Taki","SDE",50,15,50000.0));
	db.add(new EmployeeComparable("Naga Arjun","SDE",60,7,600000.0));
	db.add(new EmployeeComparable("Naga Arjun","SDE",60,7,6500000.0));
	db.add(new EmployeeComparable("Naga Arjun","SDE",60,7,600000.0));
	db.add(new EmployeeComparable("Siya","Tester",70,12,120000.0));
	
	for (EmployeeComparable i : db) {
		System.out.println(i);
	}
	}

}
