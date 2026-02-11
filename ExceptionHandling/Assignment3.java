package ExceptionHandling;


abstract class Employee{
	  String name;int age;
	  String location;
	  String department;
	  int EmpId;
	  int sal;
	  int days;
	  int bonus;

	public Employee(String name, int age, String location, String department, int empId, int sal, int days, int bonus) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.department = department;
		EmpId = empId;
		this.sal = sal;
		this.days = days;
		this.bonus = bonus;
	}
	public Employee() {
		
	}
	public abstract int calculate(int sal, int days, int bonus);
	public void displayDetails(){
System.out.println(name);
System.out.println(age);
System.out.println(location);
System.out.println(department);
System.out.println(EmpId);
	}
}

class FullTimeEmployee extends Employee{
	public int calculate(int sal, int days ,int bonus) {
		return sal*days+bonus;
	}

	public FullTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTimeEmployee(String name, int age, String location, String department, int empId, int sal, int days,
			int bonus) {
		super(name, age, location, department, empId, sal, days, bonus);
		// TODO Auto-generated constructor stub
	}


	
}

class PartTimeEmployee extends Employee{
	public int calculate(int sal, int days ,int bonus) {
		return sal*days+bonus;
	}

	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(String name, int age, String location, String department, int empId, int sal, int days,
			int bonus) {
		super(name, age, location, department, empId, sal, days, bonus);
		// TODO Auto-generated constructor stub
	}


	

	
}
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FullTimeEmployee e1= new FullTimeEmployee("Dhiraj", 23, "Pune", "QA", 123, 3000, 320, 20000);
		System.out.println(e1.calculate(3000, 320, 20000));

	}

}
