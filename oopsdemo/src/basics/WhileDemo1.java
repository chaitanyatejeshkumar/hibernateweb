package basics;
/*
 * program to display numbers from 1 to 10.
 * 
 * Understand the concept of Loop.
 * Loop - A set of statements executing repeatedly , until a particular
 * condition is TRUE.
 */
public class WhileDemo1 {

	public static void main(String[] args) {
		int i=1;         // loop initialization
		
		while(i<=100)    // set a condition
		{
			System.out.println(i+ " Chai");
			
			i=i+1;       // Increment Loop
		}
		
		System.out.println("Exiting the Loop........");
		
		System.out.println("********* Reverse Loop ***********");
		
		int j=10;
		
		
		while(j>=1)
		{
			System.out.println(j);
			
			j=j-1;    //Decrement Loop
		}

	}

}
