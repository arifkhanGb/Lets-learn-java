package day_9_10;
/*
Exercise 9: Set Intersection
Design a Java program that finds the intersection of two sets of integers using HashSet. 
  Allow users to input the sets and display the common elements.

 */

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Question_9 {

	public static void main(String[] args) {
		
		try {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter Value in first list");
		
		for(int input = 0; input<5; input++)
		{
			set1.add(sc.nextInt());
		}
		
		
		System.out.println("enter element in second list");
		for(int input = 0; input<5; input++)
		{
			set2.add(sc.nextInt());
		}
		System.out.println();
		System.out.println("showing first List");
		
		Iterator it = set1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		
		System.out.println("showing secont List");
		Iterator it1 = set2.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+ " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("common Element in List first and list second are!");
		
		
		//By this we get common value from two set.
		set1.retainAll(set2);
		System.out.println(set1);
		
		}
		catch(NullPointerException e) {
			System.out.println(e);
			
		}
		catch(InputMismatchException in)
		{
			System.out.println(" input missmatch please enter number  only");
		}

	}

}
