package fileio;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serialization {

	public static void main(String[] args) {
		
		Employee e = new Employee();
        e.name = "Micheal Khan";
        e.address = "Castle Street, Bangalore";
        e.SSN = 11122333;
        e.number = 101;
        try
        {
           OutputStream fileOut =
           new FileOutputStream("c:/demo/employee.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(e);// Serialization - save state of an object
           out.close();
           fileOut.close();
           System.out.printf("Serialized data is saved in d:/abc/employee.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }

	}

}
