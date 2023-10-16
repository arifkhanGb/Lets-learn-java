package FirstPackage;

import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
		System.out.println("enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age >= 18)
			System.out.println("eligible for voting");
		else
		System.out.println("not eligible for voting");
		
	}

}
