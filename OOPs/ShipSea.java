package OOPs;

 class Ship{
	 String name, type;
	 int weight, price;
	 Ship( String name, String type, int weight,int price){
		 this.name=name;
		 this.type=type;
		 this.weight=weight;
		 this.price=price;
	 }
	 public void displayShip() {
		 System.out.println("Name of Ship: "+name);
		 System.out.println("Type of Ship: "+type);
		 System.out.println("Weight of Ship: "+weight);
		 System.out.println("Price of Ship: "+price);
	 }
 }
 
  class Water{
	  String type, waterName;
	  Ship s1;
	  Water( String type,String waterName){
		  this.type=type;
		  this.waterName=waterName;
		 
		  System.out.println("Water created");
	  }
	  
	  public void displayWater() {
		  System.out.println("Type of water: "+type);
		  System.out.println("Type of Water Name: "+waterName);
		  }
	  
	  public void sailShip(String name, String type, int weight,int price) {
		   s1= new Ship(name, type, weight, price);
		   System.out.println("Ship Created");
	  }
  }
 
 public class ShipSea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Water w1 =new Water("Sea", "Indian Ocean");
         w1.displayWater();
         w1.sailShip("INS Vikrant", "Warship", 5000000, 700000000);
         w1.s1.displayShip();
         System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         Water w2 =new Water("River", "Godavari");
         w2.displayWater();
         w2.sailShip("Atlantis", "Cargo Ship", 5000003, 70000000);
         w2.s1.displayShip();
	}

}
