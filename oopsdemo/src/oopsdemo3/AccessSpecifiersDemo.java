package oopsdemo3;

import oopsdemo1.Bicycle;

class Test
{
	int a;
	private int b;
	protected int c;
	public int d;
	
	public Test(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		d=500;
	}
	
	   public Test(int a2, int b2, int c2) {
		// TODO Auto-generated constructor stub
	}

	public void display()  // public method
	    {
	        System.out.println("Private Variable:"+b);
	    }
	
	
}
class Test2 extends Test
{

	public Test2(int a, int b, int c) {
		super(a, b, c);
	}
	public void display()  // public method
    {
        System.out.println("Protected Variable:"+c);
    }
	
	void print()
	{
		System.out.println("Hello from Default Method");
    
} 
	
public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		
		Test t1=new Test(100,200,300);
		t1.display();
		//t1.b=50; compiler error. cannot access private variable
		System.out.println("Defaut Variable :"+t1.a);
		
		Test2 t2=new Test2(100,200,300);
		t2.display();
		
		Bicycle sportsBicycle = new Bicycle();
		
		//access public method of oopsdemo1.Bicycle
		sportsBicycle.startCycling();
		
		//access public method of oopsdemo1.Bicycle
		//sportsBicycle.applyBreak();
		
		
		
	}

	}

}
