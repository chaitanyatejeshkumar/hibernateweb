package practice;

public class Area {
	int length,breadth,area;

	public Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	 
	public void returnArea() {
		System.out.println("length is:" +length);
		System.out.println("breadth is:"+breadth);
		area = length*breadth;
		System.out.println(" area is:"+area);
	}
}
	
	

	
	
	