package Threading;

import java.util.Iterator;

public class MyThread2 extends Thread {

	public void run() {
		for (int i=0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread got interrupted");
				
			}
		}
	}
}
