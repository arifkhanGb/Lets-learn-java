package day_9_10;

import java.util.HashSet;
import java.util.Set;

/*
 Exercise 4: Unique Numbers Set
Design a Java program that accepts a list of numbers and uses a HashSet to remove duplicates,
 displaying the unique numbers.

 */
public class Question_4 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(12);
		set.add(21);
		set.add(23);
		set.add(12);
//		System.out.println(set.size());
		System.out.println("emplements Hash-Set");
		System.out.println(set);
	}

}
