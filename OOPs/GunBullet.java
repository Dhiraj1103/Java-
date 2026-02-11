package OOPs;
//has-a-relationship (Early instantiation)
class Bullet{
	String shape;
 	double weight, caliber, length;
	Bullet(String shape,double weight, double caliber, double length){
		this.shape=shape;
		this.weight=weight;
		this.caliber=caliber;
		this.length=length;
		System.out.println("Bullet Created");
	}
	
	public void displayBullet() {
		System.out.println("Shape of Bullet: "+shape);
		System.out.println("Weight of Bullet: "+weight);
		System.out.println("Caliber of Bullet: "+caliber);
		System.out.println("Length of Bullet: "+length);
	}
}

 class Gun{
	 String type;
	 double gunLength, gunCaliber;
	 Bullet b1;
	 Gun(String type,double gunCaliber, double gunLength,String shape,double weight, double caliber, double length){
		 this.type=type;
		 this.gunLength=gunLength;
		 this.gunCaliber=gunCaliber;
		
		 b1=new Bullet(shape, weight, caliber, length);
		 System.out.println("Gun created");
     }
	 public void displayGun() {
		 System.out.println("Type of Gun: "+type);
			System.out.println("Length of Gun: "+gunLength);
			System.out.println("Caliber of Gun: "+gunCaliber);
		
	 }
 }

public class GunBullet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Gun g1= new Gun("Pistol", 22, 10, "Round", 20, 22, 5);
      g1.b1.displayBullet();
      System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
       g1.displayGun();
	}

}
