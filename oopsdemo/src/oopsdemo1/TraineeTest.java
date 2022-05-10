package oopsdemo1;

public class TraineeTest {

	public static void main(String[] args) {
		
		Trainee t1=new Trainee(); //invokes impicit constructor
		t1.display();
		
		//invokes parameterized constructor
		Trainee t2=new Trainee(222,"Rod Jhonson","spring",7000);
		t2.display();
		
		Trainee t3=new Trainee(333,"king","Hibernate",6000);
		t3.display();
	}

}
