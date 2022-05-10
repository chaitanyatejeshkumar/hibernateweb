/*
 * Java Program to perform Arithmetic Operations
 * Coded during Java Training on 16/3/2022
 */package oopsdemo;

public class Arithmetic {
public static void main(String[] args) {
	// Variable Declaration & Initialization
    int a=20,b=30,sum,sub,mul;
    float div;
   
    //process/computation statements
    sum=a+b;
    sub=a-b;
    mul=a*b;
    div=a/b;
   
    // Output statements
    System.out.println("The Addition of "+ a + " and "+b+ " is : "+sum);
    System.out.println("The Subtraction of "+ a + " and "+b+ " is : "+sub);
    System.out.println("The Multiplication of "+ a + " and "+b+ " is : "+mul);
    System.out.println("The Division of "+ a + " and "+b+ " is : "+div);
}
}
