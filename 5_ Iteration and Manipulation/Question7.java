package Day_11_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        System.out.println("please enter Age");
        Scanner scan = new Scanner(System.in);

        try {
            int age = scan.nextInt();
            if (age > 18)
                System.out.println("You can vote.");
            else
                System.out.println("can`t vote");
        }catch (ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
        catch (InputMismatchException ie)
        {
//            System.out.println(ie.getMessage());
            System.out.println(ie.toString());
        }
    }
}
