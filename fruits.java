package FirstPackage;

import java.util.Scanner;

public class fruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char alphabate = sc.next().toUpperCase().charAt(0);
		
		switch(alphabate) {
		case ('A'): System.out.println("Apple");
		break;
		case ('B'): System.out.println("Banana");
		break;
		case ('C'): System.out.println("cherry");
		break;
		default: System.out.println("not mached");
		}
	}

}
