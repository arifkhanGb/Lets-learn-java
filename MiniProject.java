package FirstPackage;
import java.util.Scanner;
public class MiniProject {

// The concept I have learnt , by those i made a small project.
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number (1-100)");
		int myNumber = (int)(Math.random()*100);
//		double a = Math.random(100);
//		System.out.println(a);
		int UserNumber;
		do {
			 UserNumber = sc.nextInt();
			if(myNumber == UserNumber) {
				System.out.println("you got the right number");
			break;
			}
			else if(myNumber > UserNumber)
			{
				System.out.println("your Number is small");
			}
			else
				System.out.println("your number is large");
			
		}while(UserNumber >= 0);
		System.out.println("your number is = "+ UserNumber);
	}

}
