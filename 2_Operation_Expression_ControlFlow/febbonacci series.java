package SecondPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise_7 { // fabonacci

	public static void main(String[] args) {
		try {
		int a = 0, b = 1, result;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(a+ " ");
		System.out.print(b+ " ");
		for(int i = 0; i<10; i++)
		{
			result = a+b;
			System.out.print(result+ " ");
			a=b;
			b=result;
		}
		
		}catch(InputMismatchException e)
		{
			System.out.println(e.toString());
		}
	}
	

}
