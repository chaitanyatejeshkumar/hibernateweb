package basics;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		int i=1,n,sum=0;
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter Value for N : ");
        n=s.nextInt();
        s.close();
        
        while(i<=n)
        {
        	sum=sum+i;
        	System.out.println("The sum Of series in "+ i +" : "+sum);
        	i=i+1;
        }
        System.out.println("The Sum Of Series is :" + sum);
	
	