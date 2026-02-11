package OOPs;

class Car{
	String model, brand, type;
	double price, warranty;
	public Car() {
		
	}
	public Car(String model, String brand, String type, double price, double warranty) {
		super();
		this.model = model;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.warranty = warranty;
	}
	
	public  String toString() {
		return "[Car name:"+model+", Car Brand: "+brand+", Car Type: "+type+", Price: "+price+", Warranty: "+warranty+"]"; 
	}
	public boolean equals(Object o) {
		Car c= (Car) o;
		if(this.model==c.model && this.brand==c.brand && this.type==c.type && this.price==c.price && this.warranty==warranty)
			return true;
		else
			return false;
	}
	
}
public class Equals1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car c= new Car("Volkswagen","Virtus","Sedan", 2550000.0,3.5);
      System.out.println(c.toString());
      Car c1= new Car("Volkswagen","Virtus","Sedan", 2550000.0,3.5);
      System.out.println(c1.toString());
      System.out.println(c1.equals(c));
	}

}
