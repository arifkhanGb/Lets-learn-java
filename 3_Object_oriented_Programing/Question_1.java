package FourPackage;

/* Exercise 1: Inheritance Hierarchy
Create a Java inheritance hierarchy representing different types of vehicles, including cars, motorcycles,
 and bicycles. Include common attributes and methods in a superclass, and specific attributes and methods in subclasses.
*/

class Vehicle{
	String speed;
	int gear;
	public void drive() {
		System.out.println("Vehicle Driving");
	}
}
class Car extends Vehicle{
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public void drive() {
		System.out.println("Car Driving on gear : " +gear +" and speed :" + speed );
	}
}

class Motercycle extends Vehicle{
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getGear() {
		return gear;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getSpeed() {
		return speed;
	}
	public void drive() {
		System.out.println("motercycle Driving on gear : " +gear +" and speed :" + speed );
	}
}


public class Question_1 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setGear(3);
		c1.setSpeed("100");
		c1.drive();
		
		System.out.println();
		
		Motercycle m1 = new Motercycle();
		m1.setGear(4);
		m1.setSpeed("80");
		m1.drive();
		
		
		// System.out.println("Motercycle Driving on gear : " +m1.getGear() +" and speed :" + m1.getSpeed() );
		

	}

}
