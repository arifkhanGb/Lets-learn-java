package SecondPackage;

import java.util.Scanner;

//this will print table.
public class tablePrint {

	public static void main(String[] args) {
		System.out.println("enter number of table");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i = 1; i<=10;i++)
		{
			System.out.print(input*i+ "  ");
		}
	}

}
