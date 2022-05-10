package oopsdemo1;
/*
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
 * To achieve this, you must:
   declare class variables/attributes as private
   provide public get and set methods to access and update the value of a private variable
   
   The get method returns the value of the variable name.

 

   The set method takes a parameter (newName) and assigns it to the name variable. 
 */
public class Book {
     
	private static final String BookName = null;
	//properties
    private int bookId;
    private String bookName;
    private float price;
    private String publisher;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
    
    // Generate Getters & Setters -> Place a cursor in new blank line -->Right click
    // --> Source ---> Generate Getters & Setters --> Select all --> Generate
    void display() {
    	System.out.println("*******Welcome to Regal Book Shop ");
    }
    
    @Override
    public String toString() {
    	return "Book [bookId=" + bookId + ",BookName=" + BookName + ", price=" + price +", publisher=" + publisher +"]"; 
    }
	public String discountprice() {
		// TODO Auto-generated method stub
		return null;
	}
}
