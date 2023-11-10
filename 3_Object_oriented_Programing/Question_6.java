package FourPackage;

/*
 * Exercise 6: Abstract Shape Class
Create an abstract class called "Shape" with abstract methods for calculating area and perimeter. 
Implement this class in subclasses for different shapes (e.g., circle, rectangle)

 */

abstract class Shape{
	static float PI = 3.14f;
	static double result;
	
	abstract void area();
	abstract void display();
	
}
class Circl extends Shape{
	
	double radius;
	
	 Circl(double r) {
		radius = r;
	}
	
	@Override
	void area() {
		
		result = PI * radius * radius;
	}
	void display() {
		System.out.println("Circle area is =  "+ result);
	}
}

class Ractangl extends Shape{
		double length , width ;
		
		Ractangl(double l , double w){
			length = l;
			width = w;
			
		}
		
	@Override
	void area() {
		result = length * width;
		
	}
	void display() {
		System.out.println("ractangle area is =  "+ result);
	}
	
}

public class Question_6 {

	public static void main(String[] args) {
		Circl c = new Circl(5.5);
		c.area();
		c.display();
		
		System.out.println();
		
		Ractangl r = new Ractangl(5,10);
		r.area();
		r.display();
		
	}

}
