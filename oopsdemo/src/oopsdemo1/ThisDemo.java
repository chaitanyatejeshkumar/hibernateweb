package oopsdemo1;

public class ThisDemo {
	
	int age;
	
	void init(int age)
	{
		this.age=age;// this keyword refers to the current object which invokes the method
	}

	public static void main(String[] args) {
		
		ThisDemo td1=new ThisDemo();
		td1.init(20);
		
		System.out.println("The value of age is:"+td1.age);
		

	}

}
