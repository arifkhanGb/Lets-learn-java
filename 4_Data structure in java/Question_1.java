package day_9_10;

import java.util.Scanner;

/*
 Exercise 1: Array Manipulation
Write a Java program that finds the sum and average of elements in an integer array. 
Allow the user to input the array's size and elements.

 */
public class Question_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("give size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("enter elements in an array");
		
		for(int input = 0; input<arr.length; input++)
		{
			arr[input] = sc.nextInt();
		}
		
		System.out.println("showing elements in an array");
		
		for(int element : arr)
		{
			System.out.println(element);
		}
		
		 arraySum(arr);
		 arrayAvg(arr);
				

	}
	static int sum;
	public static void arraySum(int[] arr) {
		sum = 0;
		for(int element : arr)
		{
			sum += element;
		}
		System.out.println("Sum of all element"+sum);
	}
	public static void arrayAvg(int arr[]) {
		System.out.println("Average of array"+ sum/arr.length);
	}

}
