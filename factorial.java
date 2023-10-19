package FirstPackage;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int fact = 1;
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0) {
		for(int i = 1; i<=num; i++)
		{
			fact*=i;
		}
		System.out.println("factorial of " + num + " is = "+ fact);
		}else
			System.out.println("enter positive Number");

	}

}
