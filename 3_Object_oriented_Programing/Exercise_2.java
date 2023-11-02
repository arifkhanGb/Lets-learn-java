package ThirdPackage;

class Car{
	String car_name, model;
	int year;
	
	public void setProperty(String car_name, String model, int year ) {
		this.car_name = car_name;
		this.model = model;
		this.year = year;
	}
	public void retreiveProperty() {
		System.out.println("Name of the Car = "+ car_name);
		System.out.println("model Number = " + model);
		System.out.println("Year = " + year);
	}
}
public class Exercise_2 {

	public static void main(String[] args) {
		
		Car car_object = new Car();
		car_object.setProperty("safari", "2022",123);
		car_object.retreiveProperty();
	}

}
