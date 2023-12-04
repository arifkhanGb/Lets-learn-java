package Day_11_12;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// this is for Unchecked Exception
class UncheckedException{

    void method1(){
        int a = 4/0;
    }
    void method2(){

        method1();
    }
    void method3(){

        try {

            method2();

        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class CheckedPropagate{

    void method1() throws IOException {
//        int a = 4/0;
        throw new IOException("divice error");
    }
    void method2() throws IOException {

        method1();
    }
    void method3(){

        try {

            method2();

        }catch (Exception e)
        {
            System.out.println("Exception Handled");
        }
    }
}



public class Question10 {
    public static void main(String[] args) {
        UncheckedException obj = new UncheckedException();
        obj.method3();

        CheckedPropagate obj1 = new  CheckedPropagate();
        obj1.method3();


    }
}
