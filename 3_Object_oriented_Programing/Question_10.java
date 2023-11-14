package FourPackage;
/*
Exercise 10: Abstract Class and Interface Combination
Create an abstract class "Vehicle" with attributes like make, model, and year.
 Implement this class in subclasses for different vehicle types (e.g., car, motorcycle). 
 Additionally, implement interfaces for "Drivable" and "FuelEfficient" and showcase how 
 the class combines both abstract class and interface features.

 */
abstract class Vehicl{
	 String make , model;
	 int year;
	
}
interface Drivable{
	public void start();
	public void stop();
	public void carDetails();
	
	
}
interface FuelEffecient{
	public void fuelEffecient();
	
}

class Cars extends Vehicl implements Drivable,FuelEffecient{

	Cars(String make , String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void carDetails() {
		System.out.println("car name = "+ make );
		System.out.println("model No. = " + model );
		System.out.println("Year " +year );
	}
	
	@Override
	public void start() {
		
		System.out.println("car start");
	}

	@Override
	public void stop() {
		System.out.println("car stop");
		
	}

	@Override
	public void fuelEffecient() {
		System.out.println("fuil is full");
		
	}
	
}

public class Question_10 {

	public static void main(String[] args) {
		
		Cars c1 = new Cars("volvo","202F", 2019 );
		c1.carDetails();
		System.out.println();
		c1.start();
		c1.stop();
		c1.fuelEffecient();
	}

}
