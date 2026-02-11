package OOPs;

public class SoftwareEngineer{
	  String name, company, degree;
	  int empId, exp;
	  double salary;
	  public SoftwareEngineer() {
		  
	  }
	  
	  public SoftwareEngineer(String name,String company,String degree, int empId, int exp,  double salary) {
		  this.name=name;
		  this.company=company;
		  this.degree=degree;
		  this.empId=empId;
		  this.exp=exp;
		  this.salary=salary;
		  }
	  public void displaySE() {
		  System.out.println("Name: "+name);
		  System.out.println("Company: "+company);
		  System.out.println("Degree: "+degree);
		  System.out.println("EmpId: "+empId);
		  System.out.println("Experience: "+exp);
		  System.out.println("Salary: "+salary);
	 }
	}
