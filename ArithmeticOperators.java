package SecondPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a,b,c;
		try {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		char op = sc.next().charAt(0);
		b = sc.nextInt();
		
		switch(op)
		{
		case '+': c= a+b;
				System.out.println(c);
				break;
				
		case '-': c= a-b;
		System.out.println(c);
		break;
		
		case '*': c= a*b;
		System.out.println(c);
		break;
		
		case '/': c= a/b;
		System.out.println(c);
		
		case '%': c= a/b;
		System.out.println(c);
		
		default:
			System.out.println("No operator found");
		}
		}
		catch(InputMismatchException e) {
			System.out.println(e.toString());
			
		}

	}

}
