package basics;

import java.util.Scanner;

//prgm to display odd & even nos between 1 & 10
/*
ODD        EVEN
---        ----
1        2
3        4
5        6
7        8
9        10     
*/   
public class OddEvenDisplay {

	public static void main(String[] args) {
		System.out.println("ODD\tEVEN");
        System.out.println("----\t-----");
        int i=1;
        while(i<=10)
        {
            if(i%2==1)
            {
                System.out.print(i);
            }
            else
            {
                System.out.println("\t"+i);
            }
            i=i+1;
        }
		}
		
		
		

	}


