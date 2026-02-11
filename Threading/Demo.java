package Threading;

public class Demo {

	
	 public static synchronized void greetings(String name) {
		 
		 for (int i = 0; i < 10; i++) {
				System.out.println("Good Morning "+name);	
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("Thread got interrupted");
					
				}
		}
		 
	}
	 public static synchronized void farewell(String name) {
		
		 for (int i = 0; i < 10; i++) {
				System.out.println("Good Byee "+name);	
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("Thread got interrupted");
					
				}
		}
	 }
}
