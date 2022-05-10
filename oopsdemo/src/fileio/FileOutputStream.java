package fileio;

import java.io.FileNotFoundException;

public class FileOutputStream {


	public FileOutputStream(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String fname="c:/demo/data1.txt";
		
		FileOutputStream fos=new FileOutputStream();
		
		String text="Today is Beautiful Day";
		
		byte[] myBytes=text.getBytes();
		
		 fos.write(myBytes);
		 System.out.println("Data Written to Binary file");
		fos.close();
	}
	catch (FileNotFoundException e) {
		
		
	}

	void close() {
		// TODO Auto-generated method stub
		
	}

	private void write(byte[] myBytes) {
		// TODO Auto-generated method stub
		
	}

}
