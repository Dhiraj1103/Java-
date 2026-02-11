package Threading;

public class T1Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Thread Begins");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println();
		
		Thread1 t1= new Thread1();
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		
		Thread2 t2= new Thread2();
		t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
	
		System.out.println(Thread.currentThread().getName()+" started");
             for (int i = 100; i <501 ; i+=100) {
				System.out.println(i);
			}
     		System.out.println(Thread.currentThread().getName()+" ended");

    
		

     
	}

}
//		