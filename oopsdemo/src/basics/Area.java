package basics;
/*
 * Java program to find area of the circle
 */
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float a,r;
		final float PI=3.14f; // constant declaration
		
		System.out.println("Enter Radius of a Circle :");
		r=s.nextFloat();  // float input
		
		a=PI*r*r;  // calculate area of circle
		
		System.out.println("The Area of Circle is : ");
		System.out.format("%.2f", a);
		

	}

}
