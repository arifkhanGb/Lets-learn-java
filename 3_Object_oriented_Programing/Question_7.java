package FourPackage;

/*
 Exercise 7: Interface Implementation
Define a Java interface called "Resizable" with a method for resizing objects.
 Implement this interface in classes for various resizable objects, such as images and windows.

 */
interface Resizable{
	public void resizeWidth(double width);
	public abstract void resizeHeight(double height);
	public abstract void printSize();
}

class Image implements Resizable{
		
	private double width, height;
	
		Image(double width , double height){
		this.width = width;
		this.height = height;
		}
	@Override
	public void resizeWidth(double width) {
		this.width = width;
	}
	public void resizeHeight(double height) {
		this.height = height;
			
	}
	@Override
	public void printSize() {
		System.out.println("Image width and height = " +width + " and "+ height);
		
	}
	
}
  class Window implements Resizable{
	  
	  private double width , height;
	  
	  Window(double width , double height){
		  this.width = width;
		  this.height = height;
	  }

	@Override
	public void resizeWidth(double width) {
		this.width = width;
		
		
	}

	@Override
	public void resizeHeight(double height) {
		this.height = height;
		
	}

	@Override
	public void printSize() {
		System.out.println("Image width and height = " + width  + " and " + height);
		
	}
	  
  }

public class Question_7 {

	public static void main(String[] args) {
		Image img = new Image(5,10);
		System.out.println("Before set the size of Image");
		img.printSize();
		
		img.resizeHeight(20);
		img.resizeWidth(40);
		System.out.println();
		System.out.println("After set the size of Image");
		img.printSize();
		
		System.out.println();
		
		Window w = new Window(70,60);
		System.out.println("Before set the size of window");
		w.printSize();
		
		w.resizeWidth(50);
		w.resizeHeight(30);
		
		System.out.println();
		System.out.println("After set the size of window");
		w.printSize();

	}

}
