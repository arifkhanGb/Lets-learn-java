package SecondPackage;

import java.util.Scanner;

//Practice-2

public class logicalOperator {

	public static void main(String[] args) {
		
		System.out.println("enter number");
		
		Scanner sc = new Scanner(System.in);
		int UserNumber = sc.nextInt();
		if(UserNumber < 0)
			System.out.println("negetive Number not Acceptable");
		else if(UserNumber >=10 && UserNumber<=20)
			System.out.println("your Number is in the range ="+ UserNumber);
		else
			System.out.println("number out of the range");
		
	}

}
