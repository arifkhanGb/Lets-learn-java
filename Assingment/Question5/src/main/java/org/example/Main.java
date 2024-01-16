package org.example;


public class Main {
    public static void main(String[] args) {


      Calculator addition = (a,b) -> a+b;
        Calculator subtract = (a,b) -> a-b;
        Calculator multiplication = (a,b) -> a*b;


        System.out.println(addition.calculate(5,4));
        System.out.println(subtract.calculate(5,4));
        System.out.println(multiplication.calculate(5,4));
    }

}