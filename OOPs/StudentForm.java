package OOPs;
import java.util.Scanner;
public class StudentForm {
     String name, address, dob, courseName, gender, email, password;
     int uniID, yop ;
     long contactNo;
       StudentForm() {
		// TODO Auto-generated constructor stub
	}
       StudentForm(String name, String address, String dob, String courseName, String gender, String email, String password, int uniID, int yop, long contactNo) {
   		this.name=name;
   		this.address=address;
   		this.dob=dob;
   		this.courseName=courseName;
   		this.gender=gender;
   		this.email=email;
   		this.uniID=uniID;
   		this.yop=yop;
   		this.contactNo=contactNo;
   		this.password=password;
   	}
       
       public String getName() { return name;  }
       public String getAddress() { return address; }
       public String getdob() { return dob; }
       public String getCourseName() { return courseName; }
       public String getGender() { return gender; }
       public String getEmail() { return email; }
    //---------------------------------------------------------------------------------------------------------------   
       public String setEmail(int uniID, String password, String newEmail) { 
    	   if(this.uniID==uniID && this.password.equals(password)) {
    	   this.email=newEmail;
    	   System.out.println("New Email Set Successfully");
    	   return email;
		}
    	   else {
    		   System.out.println("Invalid Credentials");
    	   }
    	   return "exit";
       }
       //---------------------------------------------------------------------------------------------------------------  
       public void setPassword(int uniID, String password, String newPassword) {
    	   if(this.uniID==uniID && this.password.equals(password)) {
    		   if(this.password.equals(newPassword)) {
    			   System.out.println("Please enter new Password");
    		   }
    		   else {
    			   this.password=newPassword;
    			   System.out.println("Password set Successfully");
    		   }
    		  }
    	   else {
			   System.out.println("Invalid Credentials");
		   }
		   
       }
       
       public int getUniID() { return uniID; }
       public int getYop() { return yop; }
       public long getContactNo() { return contactNo; }
       
       //---------------------------------------------------------------------------------------------------------------  
       public long setContactNo(int uniID, String password, long newContactNo) {
    	   if(this.uniID==uniID && this.password.equals(password)) {
    		   this.contactNo=newContactNo;
    		   System.out.println("Contact Updated Successfully");
    	   }
    	   return contactNo;
	}
}

class DisplayForm{
	public static void main(String[] args) {
		StudentForm s1=new StudentForm("Dhiraj Shelke", "Pune", "11-03-2003", "BTECH", "Male", "d.shelke2003@gmail.com", "d1132003", 11032003, 2025, 7972066855l);
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------Welcome to Qspiders---------");
		System.out.println();
		System.out.print("Please enter 1 to get details or enter 2 to edit details: ");
		int ip=sc.nextInt();
		System.out.println();
		if(ip==1) {
		  for(;;) {
		System.out.println("Please select the option from the following to get details: ");
		
		System.out.println("1. Get Student Name");
		System.out.println("2. Get Adddress");
		System.out.println("3. Get Date of Birth ");
		System.out.println("4. Get Course Name");
		System.out.println("5. Get Gender");
		System.out.println("6. Get Email");
		System.out.println("7. Get University ID");
		System.out.println("8. Get Year of Passing");
		System.out.println("9. Get Contact Number");
		System.out.println("0. Press 0 for exit");
		int op=sc.nextInt();
		switch (op) {
		case 1 -> System.out.println("Student Name: "+s1.getName());
		case 2 -> System.out.println("Student Address: "+s1.getAddress());
		case 3 -> System.out.println("Student Date of Birth: "+s1.getdob());
		case 4 -> System.out.println("Student Course Name: "+s1.getCourseName());
		case 5 -> System.out.println("Student Gender: "+s1.getGender());
		case 6 -> System.out.println("Student Email: "+s1.getEmail());
		case 7 -> System.out.println("Student University ID: "+s1.getUniID());
		case 8 -> System.out.println("Student Year of Passing: "+s1.getYop());
		case 9 -> System.out.println("Student Contact Number: "+s1.getContactNo());
		case 0 ->  System.exit(0);
		default -> System.out.println("Invalid option");
		}
		}
	}
		else if(ip==2) {
			for(;;) {
			System.out.println("Please select the option from the following to Edit details: ");
			System.out.println("1. Edit Email");
			System.out.println("2. Edit Password");
			System.out.println("3. Edit Contact Number");
			System.out.println("0. Press 0 to exit");
			int op=sc.nextInt();
			
			switch (op) {
			case 1:{
				System.out.print("Enter University ID: ");
				int uniId=sc.nextInt();
				System.out.print("Enter Password: ");
				String password=sc.next();
				System.out.print("Enter New Email: ");
				String newEmail=sc.next();
				System.out.println(s1.setEmail(uniId,password,newEmail));
				System.out.println();
				break;
			}
			case 2:{
				System.out.print("Enter University ID: ");
				int uniId=sc.nextInt();
				System.out.print("Enter Password: ");
				String password=sc.next();
				System.out.print("Enter New Password: ");
				String newPassword=sc.next();
				s1.setPassword(uniId,password,newPassword);
				System.out.println();
				break;
			}
			case 3:{
				System.out.print("Enter University ID: ");
				int uniId=sc.nextInt();
				System.out.print("Enter Password: ");
				String password=sc.next();
				System.out.print("Enter New Contact Number: ");
				long newContactNo=sc.nextLong();
				System.out.println(s1.setContactNo(uniId,password,newContactNo));
				System.out.println();
				break;
			}
			case 0: System.exit(0);
			
			default: System.out.println("Invalid option");
			}
		}
			}
	}
	
}
