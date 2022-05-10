package miscellaneous;

import java.util.Scanner;

public class TwoPairDemo {

	public static void main(String[] args) {
		
		Pair<String,Integer> P1=new Pair<String,Integer>("The Car Guys",8);
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Our Current Rating for "+P1.getFirst() + " is : "+P1.getSecond());
	       
        System.out.println("How would you rate them ?:");
        int score =s.nextInt();
       
        P1.setSecond(score);
       
        System.out.println("Our New Rating for "+P1.getFirst() + " is : "+P1.getSecond());
       
        Pair<String,Float> p2=new Pair<String,Float>("TROY",8.5f);
       
           
        System.out.println("Our Current Rating for "+p2.getFirst() + " is : "+p2.getSecond());
       
        System.out.println("How would you rate them ?:");
        float score1 =s.nextFloat();
       
        p2.setSecond(score1);
       
        System.out.println("Our New Rating for "+p2.getFirst() + " is : "+p2.getSecond());
		

	}

}
