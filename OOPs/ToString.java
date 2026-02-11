package OOPs;
// toString()

class Employee extends Object{
	String name, dept, company;
	int empid,exp;
	char grade;
	double sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String dept, String company, int empid, int exp, char grade, double sal) {
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
 }


public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object e1= new Employee("Dhiraj","Developer","TCS",1234,5,'A',55500.0);
		System.out.println(e1.toString());

	}

}
