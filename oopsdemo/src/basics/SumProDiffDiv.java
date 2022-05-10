package basics;

import java.util.Scanner;

public class SumProDiffDiv {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1,num2,sum,product,difference,quotient;
		System.out.println("Enter 2 Numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		
		sum=num1+num2;
		product=num1*num2;
		difference=num1-num2;
		quotient=num1/num2;
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The difference is " + difference);
		System.out.println("The quotient is " + quotient);
		s.close();

	}

}
