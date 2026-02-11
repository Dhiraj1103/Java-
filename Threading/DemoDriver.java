package Threading;

public class DemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		DemoThread1 d1= new DemoThread1("Dhiraj");  
		DemoThread1 d2= new DemoThread1("Ridhiii");
		
		DemoThread2 d3= new DemoThread2("Gaurav");
		
		d1.setPriority(Thread.MAX_PRIORITY);
		d3.setPriority(Thread.MIN_PRIORITY);

		d1.start();
		d2.start();
		d3.start();
		
		
	}

}
