package oopsdemo2;

public class CandidateTest {

	public static void main(String[] args) {
		
		System.out.println("******* Candidate Details ********");
		
		JavaCandidate jc1=new JavaCandidate(1111, "Gavin King", 5000, "Hibernate");
		jc1.display();
		jc1.getperks();
		
		AccountsCandidate ac1=new AccountsCandidate(2222, "Mike John", 3000);
		ac1.display();
		ac1.getperks();
		
		
		

	}

}
