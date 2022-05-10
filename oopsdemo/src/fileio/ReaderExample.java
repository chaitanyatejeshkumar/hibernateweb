package fileio;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {


		//Reader class is used to read String/text data from a text file
		public static void main(String[] args) {
			
			  try {
		            Reader reader = new FileReader("c:/demo/data.txt");
		       int data = reader.read();  // returns unicodevalue of character
		            while (data != -1) {  // -1 when stream ends
		                System.out.print((char) data);
		                data = reader.read();
		            }
		            reader.close();
		        } catch (Exception ex) {
		            System.err.println(ex.getMessage());
		        }

	}

}
