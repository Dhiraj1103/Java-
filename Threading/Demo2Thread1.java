package Threading;

public class Demo2Thread1 extends Thread {
	String name;
	Demo2 d1;
	public Demo2Thread1() {
		
	}
	public Demo2Thread1(String name, Demo2 d) {
		super(name);
		this.name=name;
		d1=d;
	}
	
	public void run() {
		d1.greetings();
	}
	

}
