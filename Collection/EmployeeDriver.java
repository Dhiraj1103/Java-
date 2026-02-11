package Collection;
//to understand the knowledge of comparable only
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeDriver extends EmployeeComparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList<EmployeeComparable> db=new ArrayList<>();
		
		
		db.add(new EmployeeComparable("Mahesh","SDE",10,12,400000.0));
		db.add(new EmployeeComparable("Akash","Tester",20,8,400000.0));
		db.add(new EmployeeComparable("Rajsh","AIE",30,5,400300.0));
		db.add(new EmployeeComparable("Mahi","Cloud",40,7,100000.0));
		db.add(new EmployeeComparable("Taki","SDE",50,15,50000.0));
		db.add(new EmployeeComparable("Naga Arjun","SDE",60,7,600000.0));
		db.add(new EmployeeComparable("Siya","Tester",70,12,120000.0));
		
		for (EmployeeComparable i : db) {
			System.out.println(i);
		}
		for (EmployeeComparable i : db) {
			System.out.println(i.name);
		}
		Collections.sort(db);
		for (EmployeeComparable i : db) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------------");
		System.out.println(Collections.min(db));
		EmployeeComparable key = new EmployeeComparable("Taki", "SDE", 31, 0, 0.0);
		int index = Collections.binarySearch(db, key);
		System.out.println("Found at index: " + index);
		System.out.println("----------------------------------------------");
		ListIterator<EmployeeComparable> i = db.listIterator(db.size());
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		EmployeeComparable e =new EmployeeComparable("Mahi","Cloud",40,7,100000.0);
		System.out.println(db.contains(e));
	
	}

}
