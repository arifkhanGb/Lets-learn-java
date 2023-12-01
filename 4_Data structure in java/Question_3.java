package day_9_10;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Exercise 3: LinkedList Exploration
Create a Java program that explores LinkedList. Compare its performance with ArrayList for
 inserting and deleting elements at various positions in the list.


 */

public class Question_3 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		System.out.println("ArrayList Elements are");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("After removing elements from the list");
		list1.remove(2);
		
		System.err.println(list1);
		
		System.out.println();
		
		LinkedList<Character> list2 = new LinkedList<>();
		list2.add('A');
		list2.add('B');
		list2.add('C');
		System.out.println("LinkedList elements are");
		System.out.println(list2);
	 

	}

}
