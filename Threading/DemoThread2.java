package Threading;

public class DemoThread2 extends Thread{
	
	String name;
	public DemoThread2() {
		
	}
	public DemoThread2(String name) {
		this.name=name;
	}
	public void run() {
		Demo.farewell(name);
	}
	

}
