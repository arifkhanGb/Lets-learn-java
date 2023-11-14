package FourPackage;

/*
  Exercise 8: Multiple Interfaces
Build a Java program that demonstrates a class implementing multiple interfaces.
 Create interfaces for "Drawable" and "Clickable" with corresponding methods. 
 Implement these interfaces in a class representing graphical elements.

 */
interface Drawable{
	public  void drawable();
	
}
interface Clickable{
	public void Clickable();
	
}
class Graphical implements Drawable , Clickable{

	@Override
	public void drawable() {
		System.out.println("Drawable func. called");
		
	}

	@Override
	public void Clickable() {
		System.out.println("clickable func. called");
		
	}
	
}

public class Question_8 {

	public static void main(String[] args) {
		Graphical d = new Graphical();
		d.drawable();
		System.out.println();
		d.Clickable();

	}

}
