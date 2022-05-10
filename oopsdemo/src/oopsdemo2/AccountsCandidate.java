package oopsdemo2;

public class AccountsCandidate extends Candidate {
	
	double perks;

	public AccountsCandidate(int id, String name, double salary) {
		super(id, name, salary);
		
	}
	
	void getperks()
	{
		perks=salary*.5;
		System.out.println("perks of Account Candidate is :"+perks);
	}
	
	

}
