package day_9_10;
/*
 Exercise 7: TreeMap Practice
Develop a program that uses a TreeMap to maintain a list of books and their authors. 
Allow users to add books and authors and display the list in alphabetical order of book titles.

 */

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Question_7 {

	public static void main(String[] args) {

		Map<String, String> Tmap = new TreeMap<>();
		Tmap.put("Java", "jamse");
		Tmap.put("C++", "bjarne");
		Tmap.put("C", "jack");
		
		
		for(Map.Entry<String , String > e : Tmap.entrySet())
		{
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		
		
	}

}
