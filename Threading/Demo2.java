package Threading;

import java.util.Iterator;

public class Demo2 {
	
	public void greetings()   {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Loop before Sychronization "+Thread.currentThread().getName());
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
        
		synchronized (this) {
	        System.out.println("Before synchronized: " + Thread.currentThread().getName());

		}
//this refers to the current object (Demo2 object).

//So this means: Lock the current object. Only one thread can enter this block 
//on this object at a time. Others must wait.
		synchronized (Demo.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Loop in Sychronization Block "+Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Loop after Sychronization "+Thread.currentThread().getName());
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		synchronized (this) {
	        System.out.println("After synchronized: " + Thread.currentThread().getName());

		}

	}

}
