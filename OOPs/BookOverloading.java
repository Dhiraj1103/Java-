package OOPs;

class Book{
 String name;
 static String author="JK Rowlling";
 double price;
 
     public Book() {
		// TODO Auto-generated constructor stub
    	 System.out.println("Lauda");
	}
     public Book (String name, double price) {
    	 this.name=name;
    
    	 this.price=price;
     }
     public void display() {
    	 System.out.println(name);
    	 System.out.println(author);
    	 System.out.println(price);

     }
     
}




public class BookOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1= new Book("Black", 162.0);
		b1.display();
		Book b2= new Book("Dark",1564.2);
           b2.display();

	}

}
