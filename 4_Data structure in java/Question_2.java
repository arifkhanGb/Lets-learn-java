package day_9_10;

import java.util.ArrayList;

/*
 Exercise 2: ArrayList Operations 
Develop a Java program that simulates a to-do list using an ArrayList. 
Implement functions to add, remove, and   Each task should have a name and a priority level

 */
public class Question_2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("learn java");
		list.add("Learn c++");
		list.add("Learn spring");
		
		System.out.println("showing task in the list");
		for(String element : list)
		{
			System.out.println(element);
		}
	
		System.out.println();
		// remove task from list
		
		System.out.println("Remove task from the list");
		
		System.out.println(list);

	}

}
