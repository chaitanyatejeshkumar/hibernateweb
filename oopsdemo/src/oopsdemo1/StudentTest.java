package oopsdemo1;
// main class
public class StudentTest {

	public static void main(String[] args) {
		
		// Create object of student class
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		// invoke methods of student class
		s1.inputDetails();
		s2.inputDetails();
		s3.inputDetails();
		
		float tot1=s1.calculate();
		float tot2=s2.calculate();
		float tot3=s3.calculate();
		
		s1.diaplayDetails();
		System.out.println("Total Display from main:"+tot1);
		
		s2.diaplayDetails();
		System.out.println("Total Display from main:"+tot2);
		
		s3.diaplayDetails();
		System.out.println("Total Display from main:"+tot3);

	}

}
