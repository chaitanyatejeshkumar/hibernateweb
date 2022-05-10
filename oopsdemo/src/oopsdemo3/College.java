package oopsdemo3;

public class College {
	
	String name;
	int id;
	String university;
	String course;
	
	//generate constructor using fields
	public College(String name, int id, String university, String course) {
		this.name = name;
		this.id = id;
		this.university = university;
		this.course = course;
	}
	
	//generate getters
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getUniversity() {
		return university;
	}
	public String getCourse() {
		return course;
	}
	
	

}
