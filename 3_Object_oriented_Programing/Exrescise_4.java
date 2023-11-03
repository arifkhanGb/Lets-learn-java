package ThirdPackage;


//Method overloading
//Method Overloading
//		Implement a Java class named "Calculator" with overloaded methods to
//		perform addition, subtraction, multiplication, and division of numbers.
//		Test the methods with different argument types


class Calculator{
	
	
	
	public void calcFunction(int a , int b) {
		int first_No = a;
		int second_No = b;
		int result = first_No + second_No;
		System.out.println("addition of two number is = "+result);
	}
	public void calcFunction(float c , float d) {
		float first_No = c;
		float second_No = d;
		float result = first_No - second_No;
		System.out.println("subtract of two number is = "+result);
	}
	public void calcFunction(int c , float d) {
		float result = c * d;
		System.out.println("multiply of two number is = "+result);
	}
	public void calcFunction(float c , double d) {
		double result = c/d;
		System.out.println("divide of two number is = "+result);
	}
}

public class Exrescise_4 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.calcFunction(10, 5);
		calc.calcFunction(10.0f, 4.0f);
		calc.calcFunction(10, 4f);
		calc.calcFunction(10f, 5d);
	

	}

}
