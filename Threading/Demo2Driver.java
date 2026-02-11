package Threading;

public class Demo2Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1 = new Demo2();
		Demo2Thread1 t1 = new Demo2Thread1("Dhiraj", d1);
		Demo2Thread1 t2 = new Demo2Thread1("Ridhiiiii", d1);
		t1.start();
		t2.start();

	}

}
