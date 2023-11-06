package FourPackage;

/* 
 * Exercise 2: Method Overriding
Design a Java program with a superclass "Shape" that contains an abstract method to calculate the area. 
Create  subclasses for different shapes like circle, rectangle, and triangle,
 and override the area calculation method in each subclass.

 */

abstract class Shap{
	static double PI = 3.14;
	static double result;
	public abstract void calculateArea();
}
class Circle extends Shap{
	  double ratio;
	  
	  Circle(double ratio){
		this.ratio = ratio;
	 }
	  
	public void calculateArea() {
		
		
		result = PI * ratio * ratio;
		System.out.println("Area of circle = " + result);
	
	}
}
class Ractangle extends Shap{
	
	double length , width;
	
	     Ractangle(double l , double w){
	    	 length = l;
	    	 width = w;
	    	 
	     }
	
	public void calculateArea() {
		
		result = length * width;
		System.out.println("Area of Ractangle = "+ result);
	}
	
}

class Triangle extends Shap{
		double base , height;
		
		Triangle(double base , double height)
		{
			this.base = base;
			this.height = height;
		}
	
	public void calculateArea() {
		result = 0.5 * base * height;
		System.out.println("Area of Triangle = "+ result);
	}
}



public class Question_2 {

	public static void main(String[] args) {
		Triangle triangle_obj = new Triangle(5,10);
		triangle_obj.calculateArea();
		
		System.out.println();
		
		Ractangle ract_obj = new Ractangle(10,5);
		ract_obj.calculateArea();
		
		System.out.println();
		
		Circle c_obj = new Circle(5);
		c_obj.calculateArea();

	}

}
