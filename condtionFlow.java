package SecondPackage;

import java.util.Scanner;

////Practice 3

public class condtionFlow {
	
	public static void main(String[] args) {
			
			System.out.println("enter year here!");
			
			Scanner cs = new Scanner(System.in);
			int year = cs.nextInt();
			boolean is_leap_year = false;
			
			if(year%4==0) {
				is_leap_year = true;
			}
			
			if(year%100==0) {
				
				is_leap_year = true;
				
				if(year%400==0) {
					is_leap_year = true;
				}
			}
			
			else {
				is_leap_year = false;
			}
			
			if(!is_leap_year)
				System.out.println("Not a leap lear");
			else
				System.out.println("leap year");
			
			
			
			
			
	}

}
