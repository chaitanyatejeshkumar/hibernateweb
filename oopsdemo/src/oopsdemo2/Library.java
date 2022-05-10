package oopsdemo2;

import java.util.List;

//Composition Example
public class Library {
	
	List<Book> books;  // object reference --composition 

	public Library(List<Book> books) {
		this.books = books;
	}
    //getter()method
	public List<Book> getBooks() {
		return books;
	}
      
	}
	
	


