package oopsdemo2;

//Hierachical Inheritance
public class Candidate {
     
	private int id;
	private String name;
	protected double salary;
	
	public Candidate(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	void display1()
	{
		System.out.println("******** Candidate Details ********");
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}
