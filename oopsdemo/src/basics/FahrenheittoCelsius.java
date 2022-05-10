package basics;

import java.util.Scanner;

public class FahrenheittoCelsius {

	public static void main(String[] args) {
		float Fahrenheit,Celsius;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		float Fahrenheit1 =s.nextFloat();
		Celsius = ((Fahrenheit1-32)*5)/9;
		System.out.println("Tempeture in Celsius is: "+Celsius);

	}

}
