package Collection;
//to understand the knowledge of comparable only

public class EmployeeComparable implements Comparable<EmployeeComparable> {
	
	String name, role;
	int id,yoe;
	double sal;
	
	public EmployeeComparable() {
		
	}

	public EmployeeComparable(String name, String role, int id, int yoe, double sal) {
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
	public int compareTo(EmployeeComparable o) {
		return this.name.compareTo(o.name);
	}
//	@Override
//	public int compareTo(EmployeeComparable o) {
//	    return this.id - o.id;
//	}
	public boolean equals(Object o) {
		if(o!=null) {
			EmployeeComparable e=(EmployeeComparable) o;
			if(this.id==e.id && this.name==e.name && this.yoe==e.yoe && this.sal==e.sal && this.role==e.role) return true;
		}
		return false;
	}

	public int hashCode() {
	    return name.hashCode()+id+yoe+role.hashCode()+Double.hashCode(sal);
	}

	

}
