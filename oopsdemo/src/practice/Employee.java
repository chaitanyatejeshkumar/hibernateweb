package practice;

public class Employee {
	String name,address;
	int year;
	float salary;
	public Employee(String name, String address, int year, float salary) {
		this.name = name;
		this.address = address;
		this.year = year;
		this.salary = salary;
	}
	public void getDetails() {
		System.out.println("Name is "+name);
		System.out.println("Address is " +address);
		System.out.println("Year of Joining is " +year);
		System.out.println("Salary is "+salary);
	}
	
	
	
}
