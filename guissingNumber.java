package FirstPackage;

import java.util.Scanner;

public class guissingNumber {

	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("guesse the Number bitween 1 to 10");
			
			
			
			num = sc.nextInt();
			
		}while(num!= 7);
		sc.close();
		System.out.println("congrats1! you`ve hit the right number");

	}

}
