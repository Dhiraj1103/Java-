package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EmployeeALDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Comparator<EmployeeComparable> c=(o1, o2) -> o1.yoe>o2.yoe?1:(o1.yoe<o2.yoe?-1:0);
         Comparator<EmployeeComparable> c1=(o1, o2) -> o1.sal>o2.sal?1:(o1.sal<o2.sal?-1:0); 
         Comparator<EmployeeComparable> c2=(o1, o2) -> o1.name.compareTo(o2.name);
         
         ArrayList<EmployeeComparable> db=new ArrayList<EmployeeComparable>();
         
     	db.add(new EmployeeComparable("Mahesh","SDE",10,12,400000.0));
    	db.add(new EmployeeComparable("Akash","Tester",20,8,400000.0));
    	db.add(new EmployeeComparable("Rajsh","AIE",30,5,400300.0));
    	db.add(new EmployeeComparable("Mahi","Cloud",40,7,100000.0));
    	db.add(new EmployeeComparable("Mahi","Cloud",40,7,100000.0));
    	db.add(new EmployeeComparable("Taki","SDE",50,15,50000.0));
    	db.add(new EmployeeComparable("Naga Arjun","SDE",60,7,600000.0));
    	db.add(new EmployeeComparable("Siya","Tester",70,12,120000.0));
    	Collections.sort(db);
    	Collections.reverse(db);
    	
    for (EmployeeComparable i : db) {
		System.out.println(i);
	}
	
    	
    	
	}

}
