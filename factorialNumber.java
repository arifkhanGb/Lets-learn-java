package SecondPackage;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int fact = 1;
		if(input>=0) {
		for(int i = input; i>=1; i--)
		{
			fact*=i;
		}
		}
		System.out.println("factorial of "+ input + " is = " + fact);
	}

}
