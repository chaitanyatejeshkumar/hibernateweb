package practice;

public class Book {
	
	int pages;
	String Title;
	public Book(int pages, String title) {
		this.pages = pages;
		Title = title;
	}
	
	public void display() {
		System.out.println("number of pages are :" +pages);
		System.out.println("title is :" +Title);
		
	}
	
	

}
