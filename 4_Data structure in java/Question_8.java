package day_9_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Exercise 8: ArrayList vs. LinkedList Performance
 Write a Java program that measures and compares the time it takes to perform various operations
 (e.g., add, remove, search) on ArrayList and LinkedList for a large dataset.

 */



public class Question_8 {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		ArrayList<Integer> newList = new ArrayList<>(number);
		
			number.add(1);
			number.add(2);
			number.add(3);
			number.add(4);
			number.add(5);
			
			System.out.println("showing list");
			System.out.println(number);
			System.out.println();
			
			//Adding element in New List
			newList.add(6);
			newList.add(7);
			newList.add(8);
			newList.add(9);
			newList.add(10);
			
			System.out.println("showing updating List After adding element in list");
			number.addAll(newList);
			
			
			System.out.println(number);
			System.out.println();
			
			
			//Add at spacific(Index , value) position
			System.out.println("List After adding element on specific position");
			 number.add(3, 34);
			
			//traverse using Iterator
			Iterator it = number.iterator();
			
			while(it.hasNext()) {
				System.out.print(it.next() + " ");
			}
			
			System.out.println();
			System.out.println();
			System.out.println();
			/// LinkedList
			
			
			LinkedList<Character> list2 = new LinkedList<>();
			list2.add('A');
			list2.add('B');
			list2.add('C');
			System.out.println("LinkedList elements are");
			System.out.println(list2);
		


	}

}
