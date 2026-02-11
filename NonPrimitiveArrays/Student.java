package NonPrimitiveArrays;

public class Student {
	String name,degree, blood;
	int age,year,roll,marks;
	final String college="MIT";
	char gender;

	public Student() {
		
	}

	public Student(String name, int age, int year, int roll, int marks, String blood, char gender, String degree) {
		super();
		this.name = name;
		this.age = age;
		this.blood=blood;
		this.year = year;
		this.roll = roll;
		this.marks = marks;
		this.gender = gender;
		this.degree=degree;
	}
	public String toString() {
		return "[Name: "+name+", Age: "+age+", Year: "+year+", RollNo: "+roll+", Marks: "+marks+
				", Gender: "+gender+", Degree: "+degree+", College: "+college+"]";
	}
	//method for displaying the data
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Year: "+year);
		System.out.println("RollNo: "+roll);
		System.out.println("Marks: "+marks);
		System.out.println("Gender: "+gender);
		System.out.println("Degree: "+degree);
		System.out.println("College: "+college);
        System.out.println("---------------------------------------------------------");

	}
}
