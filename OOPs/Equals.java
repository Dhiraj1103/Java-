package OOPs;

//toString()

class Employees extends Object{
	String name, dept, company;
	int empid,exp;
	char grade;
	double sal;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, String dept, String company, int empid, int exp, char grade, double sal) {
		super();
		this.name = name;
		this.dept = dept;
		this.company = company;
		this.empid = empid;
		this.exp = exp;
		this.grade = grade;
		this.sal = sal;
	}
public String toString() {
	 return "[Name: "+name+", Dept: "+dept+", Company: "+company+", Dept: "+dept+", EmpID: "+empid+", Experience: "+exp+", Grade: "+grade+", Sal: "+sal+"]";
}
public boolean equals(Object obj) {   // here object is user defined data type & obj is the variable
	//initially equals compares only obj references
	Employees e=(Employees) obj;    // here we need to downcast based on the user task
	if(this.name==e.name)
	return true;
	else
		return false;
}
}

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Object e1= new Employees("Dhiraj","Developer","TCS",1234,5,'A',55500.0);
		System.out.println(e1);
		Object e2= new Employees("Dhiraj","Developer","TCS",1234,5,'A',55500.0);
		System.out.println(e1.toString());
	   System.out.println(e1.equals(e2));
	}

}
