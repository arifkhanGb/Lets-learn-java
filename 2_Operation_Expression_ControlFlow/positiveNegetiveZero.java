package SecondPackage;

import java.util.Scanner;

public class exersice_5 {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a==0)
			System.out.println("number is = "+ a);
		else if(a>0)
			System.out.println("number is positive = "+a);
		else 
			System.out.println("number is negative = "+ a);

	}

}
