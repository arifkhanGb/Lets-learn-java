package ThirdPackage;

// Constructor Practice
//Create a Java class called "Book" with attributes like title, author, and ISBN.
// Implement both default and parameterized constructors to initialize these attributes
class Book{
	private String title, Author ;
	private int ISBN;
	
	public Book(){
		System.out.println("default constructor called");
		System.out.println();
		this.title = "c++";
		this.Author = "Bjarne";
		this.ISBN =12;
		
		
		
	}
	// parameterized constructor
	public Book(int Book_number , String title, String Author){
		this.ISBN = Book_number;
		this.Author = Author;
		this.title = title;
	}
	
	public void display() {
		System.out.println("book title = " + title);
		System.out.println("book Author = " + Author);
		System.out.println("book number = " + ISBN);
	}
}
public class Exercise_3 {

	public static void main(String[] args) {
		Book obj = new Book();
		obj.display();
		System.out.println();
		
		System.out.println("parameterized constructor");
		System.out.println();
		Book book_object1 = new Book(1, "jackSparrow", "python");
		book_object1.display();
	}

}
