package OOPs;

public class Developer extends SoftwareEngineer{
	String techStack, role, domain;
	int project;
	public Developer() {
		
	}
   public Developer(String name,String company,String degree, int empId, int exp,  double salary, String techStack, String role, String domain, int project) {
	      this.name=name;
		  this.company=company;
		  this.degree=degree;
		  this.empId=empId;
		  this.exp=exp;
		  this.salary=salary;
		  this.techStack=techStack;
		  this.role=role;
		  this.domain=domain;
		  this.project=project;
   }
   public void displayDeveloper() {
	   System.out.println("Tech Stack: "+techStack);
		  System.out.println("Role: "+role);
		  System.out.println("Domain: "+domain);
		  System.out.println("Project: "+project);
		  
}
}
