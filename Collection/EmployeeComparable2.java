package Collection;

import java.util.Objects;

public class EmployeeComparable2 {
  
	String name, role;
	int id,yoe;
	double sal;
	
	public EmployeeComparable2() {
		
	}

	public EmployeeComparable2(String name, String role, int id, int yoe, double sal) {
		super();
		this.name = name;
		this.role = role;
		this.id = id;
		this.yoe = yoe;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "[name= "+name+", role= "+role+", id= "+id+","
				+ " yoe= "+yoe+", sal= "+sal+"]";
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    //This checks whether both references point to the same object in memory.
	    if (o == null || getClass() != o.getClass()) return false;
	  //  If the object passed is null, they cannot be equal.
    //  If both objects are not of the same class, they cannot be equal either.
	    EmployeeComparable2 e = (EmployeeComparable2) o;
	    return id == e.id && name.equals(e.name);
	}

	@Override
	public int hashCode() {
	    return name.hashCode()+id+yoe+role.hashCode()+Double.hashCode(sal);

	}


}
