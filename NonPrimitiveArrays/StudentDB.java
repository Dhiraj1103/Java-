package NonPrimitiveArrays;

public class StudentDB {
	
	private String user, password;
	
	private Student db[]=new Student[10];
	
	private boolean checkLogin;
	private int size;
	
	public StudentDB() {
		
	}

	public StudentDB(String user, String password) {
		super();
		this.user = user;
		this.password = password;
		System.out.println("Database Created");
	}
	
	//login method
	public boolean login(String user, String password) {
		if(user==this.user && password==this.password) {
			checkLogin= true;
			System.err.println("Login Successfull");
			return true;
		}
		System.out.println("Invalid credentials");
		return false;
	}
	
	//adding student method
	public boolean addStudent(String name, int age, int year, String degree, int marks, String blood, char gender, int roll) {
		if(checkLogin) {
			if(size<db.length*0.7) {
				db[size] = new Student(name, age, year,roll, marks, blood, gender, degree);
				size++;
				return true;
			}
			else {
				Student temp[]=new Student[db.length*2];
				for(int i=0;i<size;i++) {
					temp[i]=db[i];
				}
				db=temp;
				db[size] = new Student(name, age, year,roll, marks, blood, gender, degree);
				size++;
				return true;
			}
			
		}
		System.out.println("Please Login");
		return false;
	}
	
	//print student method
	public void printDB() {
		if(checkLogin) {
			for(int i=0;i<size;i++) {
				System.out.println(db[i]);
			}
		}
		else {
			System.out.println("Please login");
		}
	}
	
	public boolean searchByName(String name) {
		if(checkLogin) {
			for(int i=0;i<size;i++) {
				if(db[i].name.equalsIgnoreCase(name)) return true;
			}
		}
		return false;
   }
	   
       //remove by name method
       
       
       public boolean removeByName(String name) {
    	   if(checkLogin) {
    		   int i;
    		   for( i=0;i<size;i++) {
    			  if(db[i].name.equals(name)) break; 
    		   }
    		   if(i<size) {
    			   Student temp[]=new Student[db.length-1];
    			   for(int j=0;j<size;j++) {
    				   if(j<i) temp[j]=db[j];
    				  else if(j>i) temp[j-1]=db[j];
    			   }
    			   size--;
    			   db=temp;
    			   System.out.println(name+"  is removed ");
    			   return true;
    		   }
    		   else {
    			   System.out.println("Student not found");
    			   return false;
    		   }
    	   }
    	   else {
    		   System.out.println("Please Login");
    		   return false;
    	   }
       }
       
       //topper method
        public Student getTopper() {
        	int max=0;
        	Student topper=null;
        	if(checkLogin) {
        		
        		for(int i=0;i<size;i++) {
        			if(max<db[i].marks) {
        				max=db[i].marks;
        				topper=db[i];
        			}
        		}
        		return topper;
        	}
        	else {
        		System.out.println("Please login");
        		return null;
        		 }
        	 }
        
        //2nd topper method
     public Student get2ndTopper() {
    	 int max=0,max2=0;
    	 Student secondTopper=null,topper=null;
    	 if(checkLogin) {
    		 for(int i=0;i<size;i++) {
    			 if(max<db[i].marks) {
    				 max2=max;
    				 secondTopper=topper;
    				 
    				 max=db[i].marks;
                    topper=db[i];
    			 }
    			 else if(db[i].marks!=max2 && db[i].marks>max2) {
    				 max2=db[i].marks;
    				secondTopper=db[i];
    			 }
    		 }
    		 return secondTopper;
    	 }
    	 else {
    		 System.out.println("Please Login");
    		 return null;
    	 }
     }
     //delete failed student
    public void deleteFailedStudent() {
    	if(checkLogin) {
    		for(int i=0;i<size;i++) {
    			if(db[i].marks<35) {
    			for(int j=i;j<size-1;j++) {
    				db[j]=db[j+1];
    			}
    			size--;
    			i--;
    		}
    	}
    		System.out.println("Students Deleted");
    	}
    	else System.out.println("Please login");
    }
    // here we took double as it stores   byte<<short<<int<<long<<float<<char
    private int compare(double d1, double d2) {
    	if(d1>d2) return 1;
    	else if(d1<d2) return -1;
    	return 0;
    }
    
    private int compareBy(Student s1, Student s2, String attri) {
    	switch(attri) {
    	case "Age": return compare(s1.age,s2.age);
    	case "Year": return compare(s1.year,s2.year);
    	case "Gender": return compare(s1.gender, s2.gender);
    	case "Roll": return compare(s1.roll,s2.roll);
    	case "Marks": return compare(s1.marks,s2.marks);
    	case "Name": return s1.name.compareTo(s2.name);
    	case "Blood": return s1.blood.compareTo(s2.blood);
    	
    	}
        return -100;
  }
    public void sortBy(String attri) {
    	if(checkLogin) {
    		if(attri=="Name"||attri=="Year"||attri=="Gender"||attri=="Roll"||attri=="Marks"||attri=="Blood"||attri=="Age") {
    			for (int i = 0; i < size; i++) {
					for (int j = 0; j < size-1-i; j++) {
						if(compareBy(db[j], db[j+1], attri)>0) {
							Student temp=db[j];
							db[j]=db[j+1];
							db[j+1]=temp;
						}
						
					}
				}
    		}
    		else System.out.println("Attribute not found");
    	}
    }
}































