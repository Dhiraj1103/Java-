package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class throwsKeyword {

	 static void readFile() throws IOException, ArithmeticException {
	        FileReader fr = new FileReader("test.txt");
	        
	    }

	    public static void main(String[] args) throws IOException {
	        readFile();
	    }
}
