package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Writer class used to write String/text data in the 
public class WriterExample {

	public static void main(String[] args) {
		
		try 
		{
			Writer w=new FileWriter("c:/demo/data.txt");
			
			String content="She Sells sea Shells In the sea";
			
			w.write(content);
			w.close();
			System.out.println("Data Writen to a File");
		}
		catch(IOException e)
		{
			System.err.println("Error Occurred");
			e.printStackTrace();
		}

	}

}

