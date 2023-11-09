package FourPackage;

class Library_book{
	private String title , author , isbn;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
		
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
		
	}
	
	public void set_isbn(String isbn) {
		this.isbn = isbn;
	}
	public String get_isbn() {
		return isbn;
		
	}
}

public class Question_5 {

	public static void main(String[] args) {
		
		Library_book lib = new Library_book();
		
		lib.setTitle("java");
		System.out.println("Book Name = "+lib.getTitle());
		
		lib.setAuthor("bjarne");
		System.out.println("Author Name = "+lib.getAuthor());
		
		lib.set_isbn("1200450");
		System.out.println("ISBN number = "+lib.get_isbn());

	}

}
