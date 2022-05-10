package ExceptionsDemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		
		int a, b, result;
        Scanner input = new Scanner(System.in);
       
         System.out.println("Input two integers");
         a = input.nextInt();
         b = input.nextInt();  // enter 0
         
         try// statement to be monitored which may throw exception
         {
        	 result = a/b;
        	 System.out.println("Result :"+result);
         }
         catch(ArithmeticException e)// Exception throw is handled in catch block
         {
        	 System.out.println("Divide by Zero Error- Enter non Zero value");
        	 System.out.println("Exception Description :"+e.getMessage());
        	 System.out.println("Exception Name & description :"+e.toString());
        	 // Details abt exception Name, Description, Line number of code which generated Exception
        	 e.printStackTrace();
         }
         finally  // clean-up operations
         {
        	 input.close();
        	 System.out.println("In Finally Block- program execution ended");
         }

	}

}
