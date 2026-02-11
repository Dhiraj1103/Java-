package Threading;

public class Thread2 extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName()+" ended");
	      System.out.println();

	}

}
