package oopsdemo2;

public class JavaCandidate extends Candidate {
	
	private String tech;
	private double perks;

	public JavaCandidate(int id, String name, double salary) {
		super(id, name, salary);
		String t = null;
		this.tech=t;
		
	}
	
	void getperks()
	{
		perks= salary*.10;
		System.out.println("perks of Java Candidate is :"+perks);
	}
	
	public void display()
	{
		super.display();
		System.out.println(tech);
	}
	

}
