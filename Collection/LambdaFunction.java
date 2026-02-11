package Collection;

public class LambdaFunction {
	@FunctionalInterface
	interface x {
	    void add(int a, int b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		x i=(a,b)-> System.out.println(a+b);
		i.add(120,122);
	}

}
