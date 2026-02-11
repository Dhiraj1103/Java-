package ExceptionHandling;

public class MultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            String s = null;
	            System.out.println(s.length());
	        } catch (NullPointerException e) {
	            System.out.println("Null value found");
	        } catch (Exception e) {
	            System.out.println("Generic exception");
	        }
	}

}
