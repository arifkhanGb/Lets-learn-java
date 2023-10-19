package FirstPackage;

import java.util.Scanner;

public class greeting {

	public static void main(String[] args) {
		int age;
		age = 24;
		System.out.println("your age is "+ age);
		Scanner sc = new Scanner(System.in);
		String greet = sc.nextLine();
		System.out.println(greet +" " + "Arf");

	}

}
