package fileio;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * mark() & reset() methods
 */
public class BufferedReaderDemo2 {

	public static void main(String[] args) {
		
		FileReader fr = null;
        BufferedReader br = null;
        
        try {
               fr = new FileReader("c:/demo/names.txt");
               br = new BufferedReader(fr);


               //check whether InputStream supports mark/reset or not
               if(!br.markSupported()){
                     System.out.println("mark/reset not supported");
                     System.exit(0);
               }

               System.out.println(br.readLine()); // Print -> Line 1
               
               br.mark(0); // mark the position in stream
               
               System.out.println(br.readLine()); // Print -> Line 1
               System.out.println(br.readLine()); // Print -> Line 1


    }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

	}

}
