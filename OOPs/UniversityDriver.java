package OOPs;

class University{
	String uname, uLoc;
	int uContact;
	public University() {
		
	}
	public University(String uname, String uLoc, int uContact) {
		this.uname=uname;
		this.uLoc=uLoc;
		this.uContact=uContact;
	}
	public void displayUniversity() {
		System.out.println("Univeristy Name: "+uname);
		System.out.println("Univeristy Location: "+uLoc);
        System.out.println("Univeristy Contact: "+uContact);
  }
}

class College extends University{
	String cname,vc, principle,cLoc,grade;
	int seats, cId;
	public College() {
		// TODO Auto-generated constructor stub
	}
	public College(String uname, String uLoc, int uContact, String cname,String vc,String principle, String cLoc, String grade, int seats, int cId){
		this.uname=uname;
		this.uLoc=uLoc;
		this.uContact=uContact;
		this.cname=cname;
		this.cId=cId;
		this.seats=seats;
		this.vc=vc;
		this.principle=principle;
		this.cLoc=cLoc;
		this.grade=grade;
	}
	public void displayCollege() {
		System.out.println("College Name: "+cname);
		System.out.println("College Vice Chancellor: "+vc);
		System.out.println("College Principle: "+principle);
		System.out.println("College Location: "+cLoc);
        System.out.println("College Grade: "+grade);
        System.out.println("College Seats: "+seats);
		System.out.println("College ID: "+cId);

	}
}

class Department extends College{
	String dname, hod;
	int noFac, seat;
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(String uname, String uLoc, int uContact, String cname,String vc,String principle, String cLoc, String grade, 
			int seats, int cId, String dname,String hod,int noFac, int seat) {
		this.uname=uname;
		this.uLoc=uLoc;
		this.uContact=uContact;
		this.cname=cname;
		this.cId=cId;
		this.seats=seats;
		this.vc=vc;
		this.principle=principle;
		this.cLoc=cLoc;
		this.grade=grade;
		this.dname=dname;
		this.noFac=noFac;
		this.hod=hod;
		this.seat=seat;
		}
	
	public void displayDepartment() {
		System.out.println("Department Name: "+dname);
		System.out.println("Head Of Department: "+hod);
		System.out.println("Number of Faculties: "+noFac);
        System.out.println("Number of Seats: "+seat);
	}
}

public class UniversityDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1= new Department("SPPU","Pune", 789798787, "MMCOE", "Rekha .K", "P.S Vivek", "FC Road", "A", 5647, 8789, "Computer","D.Soni", 15, 100);
		d1.displayUniversity();
		d1.displayCollege();
		d1.displayDepartment();

	}

}
