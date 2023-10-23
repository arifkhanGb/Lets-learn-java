package SecondPackage;

import java.util.Scanner;

public class findMaximum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
//		int z = Math.max(10, 21);
//		System.out.println(z);
		
		
		if(a>b && b>c)
			System.out.println(a + "is greater");
		else if(b>a && a>c)
			System.out.println(b + "is greater");
		else
			System.out.println(c + "is greater");

	}

}
