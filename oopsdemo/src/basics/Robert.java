package basics;

import java.util.Scanner;

public class Robert {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int marks1,marks2,marks3,total;
		float percentage;
		System.out.println("Enter 3 numbers");
		marks1=s.nextInt();
		marks2=s.nextInt();
		marks3=s.nextInt();
		total=marks1+marks2+marks3;
		percentage=(total/(300))*100;
		System.out.println("Total marks of robert is:" + total);
		System.out.println("percentage of robert is:" + percentage);
		
		
		

	}

}
