package basics;

public class TernaryDemo {

	public static void main(String[] args) {
		
		int a=10,b=20,max;
		
		System.out.println("First Number :"+a);
		System.out.println("Second Number :"+b);
		
		max=(a >b) ? a:b;
		
		String msg=(a > b)?"A is Greatest":"B is Greatest";
		
		System.out.println("The Maximum of 2 nos is :"+max +" ."+msg);
		

	}

}
