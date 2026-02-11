package OOPs;
import java.util.Scanner;

class Subject{
	String maths,english,science,socialStudies,marathi;
	int mat,eng,sci,ss,mar;
	 Subject(int m, int e, int s, int ss, int mm) {
		this.mat=m;
		this.eng=e;
		this.sci=s;
		this.ss=ss;
		this.mar=mm;
		System.out.println("Subject Done");
	}
	 
	 public void displaySubjectMarks() {
		 System.out.println("Marks Details: ");
		 System.out.println("Maths: "+mat*100/50+"%");
		 System.out.println("English: "+eng*100/50+"%");
		 System.out.println("Science: "+sci*100/50+"%");
		 System.out.println("SocialStudies: "+ss*100/50+"%");
		 System.out.println("Marathi: "+mar*100/50+"%");
		 
	 }
	 public int displayTotal() {
		 return mat+eng+sci+ss+mar;
	 }
	 public int displayTotalPercent() {
		 return displayTotal()*100/250;
	 }
	 
	 public String displayGrade() {
		    int percent = displayTotalPercent();
		    if(percent >= 95) return "A+";
		    else if(percent >= 80) return "A";
		    else if(percent >= 60) return "B";
		    else if(percent >= 40) return "C";
		    else return "F";
		}

}

class Student{
	String name;
	int rollNo;
	Subject ss1;
	
	Student(String name, int rollNo, int m, int e, int s, int ss, int mm){
	this.name=name;
	this.rollNo=rollNo;
	System.out.println("Student Created");
	 ss1=new Subject(m, e, s, ss, mm);

	}
	public void displayStudent() {
		System.out.println("Student Details: ");
	  System.out.println("Name of Student: "+name);
	  System.out.println("Roll No of Student: "+rollNo);
	}
}


public class StudentReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Student RollNo: ");
		int roll=sc.nextInt();
		System.out.print("Enter Maths Marks: ");
		int m=sc.nextInt();
		System.out.print("Enter English Marks: ");
		int e=sc.nextInt();
		System.out.print("Enter Science Marks: ");
		int s=sc.nextInt();
		System.out.print("Enter SocialScience Marks: ");
		int ss=sc.nextInt();
		System.out.print("Enter Marathi Marks: ");
		int mm=sc.nextInt();
		
       Student s1=  new Student(name, roll,m,e,s,ss,mm);
       System.out.println();
       System.out.println("-------------------------------------------------------");
      
       s1.displayStudent();
       System.out.println("-------------------------------------------------------");
       s1.ss1.displaySubjectMarks();
       
       System.out.println("Total Marks: "+s1.ss1.displayTotal()+"/250");
       System.out.println("Total Percent: "+s1.ss1.displayTotalPercent()+"%");
       System.out.println("Grade : "+s1.ss1.displayGrade());
	}

}
