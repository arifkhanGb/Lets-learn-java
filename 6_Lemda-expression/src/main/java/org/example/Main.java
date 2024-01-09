package org.example;

public class Main {
    public static void main(String[] args) {

//1->     MyInter myInter= new MyInterImpl();
//        myInter.sayHello();

        //2-> create annonamous class for implementing this interface. here alag se class nai banani padi (like MyInterImpl).
        //jo class MyInter interface ko implement kregi uska object bnega and myInter me store hoga.

//        MyInter myInter = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("hello from myinterImpl");
//            }
//        };
//        myInter.sayHello();

        //3-> using Lamda expression for implementing this interface.
        MyInter myInter = () -> System.out.println("hello by lemda expression");
                myInter.sayHello();


//        SumInter sumInter = (int a , int b) ->{
//            return a+b;
//        };
//        System.out.println(sumInter.sum(4,5));

        SumInter sumInter = (a , b) -> a+b;
        System.out.println(sumInter.sum(4,5));

        LengthInter lengthInter = (str) -> str.length();
        System.out.println(lengthInter.getLength("arif"));
    }
}