package FourPackage;

abstract class AnimalSound{
	public abstract void sound();
}

class Dog extends AnimalSound{
	public void sound() {
		System.out.println( " Dog says bhao bhao");
	}
}
class Cat extends AnimalSound{
	public void sound() {
		System.out.println("Cat says Meow Meow");
	}
}

public class Question_4 {

	public static void main(String[] args) {
			
		Cat c = new Cat();
		c.sound();
		
		System.out.println();
		
		Dog d = new Dog();
		d.sound();
		
		System.out.println();
		

	}

}
