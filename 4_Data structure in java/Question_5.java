package day_9_10;

import java.util.Set;
import java.util.TreeSet;

/*
 Exercise 5: Sorting TreeSet
Write a Java program that uses a TreeSet to store a list of words and displays them in alphabetical order.

 */

public class Question_5 {

	public static void main(String[] args) {
		Set<String> Tset = new TreeSet<>();
		
		Tset.add("banana");
		Tset.add("Apple");
		Tset.add("papaye");
		
		System.out.println("showing sorted Tree-Set Elements");
		System.out.println(Tset);
	}

}
