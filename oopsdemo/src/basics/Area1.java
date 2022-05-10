package basics;

import java.util.Scanner;

public class Area1 {

	public static void main(String[] args) {
	   Scanner s=new Scanner (System.in);
	   
	   float l,b,area;
	   System.out.println("enter the length");
	   float l1=s.nextFloat();
	   System.out.println("enter the breath");
	   float b1=s.nextFloat();
	   
	   area=l1*b1;
	   System.out.println("area is:" +area);
	   

	}

}
