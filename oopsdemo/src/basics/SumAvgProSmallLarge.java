package basics;

import java.util.Scanner;

public class SumAvgProSmallLarge {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1,num2,num3,sum,product,small,large;
		float avg;
		
		System.out.println("Enter 3 Numbers : ");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		
		sum=num1+num2+num3;
		avg=(float)sum/3;
	    product=num1*num2*num3;
	    small=num1;
	    large=num1;
	    if(num2 < small)
	    	small=num2;
	    if(num3 < small)
	    	small=num3;
	    if(num2 > large)
	    	large=num2;
	    if(num3 > large)
	    	large=num3;
	    
	    System.out.println("The sum is " + sum);
	    System.out.println("The avg is " + avg);
	    System.out.println("The product is " + product);
	    System.out.println("Smallest of three integers is" + small);
	    System.out.println("largest of three integers is" + large);
	    
	    

	}

}
