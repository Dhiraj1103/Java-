package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch handled");
            }
            int[] arr = new int[2];
            arr[3] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch handled");
        }
	}

}
