package Threading;

public class Thread1 extends Thread{

	public void run() {
		
		System.out.println("FirstThread Begins");
		System.out.println("From the FirstThread");
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getId());
	System.out.println(Thread.currentThread().getPriority());
	System.out.println("First Thread Ends");
	System.out.println();
	}
	
}
