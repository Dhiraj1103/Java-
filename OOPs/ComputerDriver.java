package OOPs;

//has-a-relationship (Lazy instantiation)
class Pendrive{
	String brand;
	int storage,price,speed;
	Pendrive(String brand, int storage, int price, int speed){
		this.brand=brand;
		this.storage=storage;
		this.price=price;
		this.speed=speed;
		
	}
	public void displayPendrive() {
		System.out.println("Brand: "+brand);
		System.out.println("Storage: "+storage);
		System.out.println("Price: "+price);
		System.out.println("Speed: "+speed);
	}
}
class Computer{
	String compBrand, processor;
	int compPrice, ram, rom;
	Pendrive p1;
	Computer(String compBrand, String processor, int compPrice,int ram,int rom){
		this.compBrand=compBrand;
		this.compPrice=compPrice;
		this.processor=processor;
		this.ram=ram;
		this.rom=rom;
		System.out.println("Computer Created");
	}
	public void displayComputer() {
		System.out.println("Computer brand: "+compBrand);
		System.out.println("Computer Price: "+compPrice);
		System.out.println("Computer processor: "+processor);
		System.out.println("Computer ram: "+ram);
		System.out.println("Computer rom: "+rom);
	}
	 public void insertPendrive(String brand, int storage, int price, int speed) {
		p1= new Pendrive(brand, storage, price, speed);
		 System.out.println("Pendrive Created");
	    	}
}   
   
public class ComputerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Computer c1= new Computer("Acer", "intel i-5", 55000, 8, 512);
      c1.displayComputer();
      System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
      c1.insertPendrive("Sandisk",32, 600, 400);
      c1.p1.displayPendrive();
	}
	

}
