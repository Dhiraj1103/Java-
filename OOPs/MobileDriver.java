package OOPs;
//has-a-relationship (Early instantiation)
 class Mobile{
	String brand,name,processor;
	int price, ram, rom;
	Battery b1;
	 
	public Mobile(String brand, String name, String processor,int price, int ram, int rom,  String batName, int mah, String type, int batPrice){
		this.brand=brand;
		this.name=name;
		this.processor=processor;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
		b1=new Battery(batName,mah,type,batPrice);
		System.out.println("Mobile created");
	}
	public void displayMobile() {
		System.out.println("Mobile Brand: "+brand);
		System.out.println("Mobile Name: "+name);
		System.out.println("Mobile Processor: "+processor);
		System.out.println("Mobile Price: "+price);
		System.out.println("Mobile Ram: "+ram);
		System.out.println("Mobile Rom: "+rom);
		
	}
	
}
 
 class Battery{
	 String batName,type;
	 int batPrice,mah;
	 
	 public Battery(String batName, int mah, String type, int batPrice) {
		 this.batName=batName;
		 this.mah=mah;
		 this.type=type;
		 this.batPrice=batPrice;
	}
	 public void displayBattery() {
			System.out.println("Battery Name: "+batName);
			System.out.println("Battery Capacity: "+mah);
			System.out.println("Battery Type: "+type);
			System.out.println("Battery Price: "+batPrice);
			
			}
}
 class MobileDriver {

	public static void main(String[] args) {
	 Mobile	m1=new Mobile("Samsung", "Galaxy s25", "Snapdragon 8 elite", 70000, 8, 258, "Exide", 4500, "Li-ion",2500);
	 Mobile	m2=new Mobile("Apple", "15 pro", "A16", 120000, 8, 258, "Amaron", 4000, "Li-ion",10000);
	  m1.displayMobile();	
	  System.out.println("-----------------------------------------------");
	   m1.b1.displayBattery();
	   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	   m2.displayMobile();	
		  System.out.println("-----------------------------------------------");
		   m2.b1.displayBattery();

	}

}
