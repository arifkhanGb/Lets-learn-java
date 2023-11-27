package day_9_10;

import java.util.Scanner;

class Example{
	
	public void showData(int[] arr) {
		
		System.out.println("these are elements in array");
		for(int element : arr)
		{
			System.out.println(element);
		}
	}
	public void updateData(int[] arr , int position, int newElement ) {
		
		for(int index = 0; index<arr.length; index++ ) {
			
			if(arr[position] == arr[index])
			{
				arr[index] = newElement;
				return;
			}	
		}
	}	
}

public class Exercise_1 {

	public static void main(String[] args) {
		
		Example e1 = new Example();
		
		int [] array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Add Elements in an array");
		for(int i = 0; i<array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		e1.showData(array);
		
		e1.updateData(array, 2, 10);
		e1.showData(array);
	}

}
