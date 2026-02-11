package Threading;

public class DemoThread1 extends Thread{

	String name;
	
	public DemoThread1() {
		
	}
	public DemoThread1(String name) {
		this.name=name;
	}
	
	public void run() {
		Demo.greetings(name);
	}
	
	
	
	
}
