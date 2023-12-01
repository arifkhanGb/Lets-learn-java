package day_9_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
Exercise 10: Word Frequency Counter
Create a Java program that takes a text document as input and uses a HashMap
 to count the frequency of each word. Display the word frequencies in descending order of occurrence.

 */

public class Question_10 {

	public static void main(String[] args) {
		String str = "Alice is girl and Bob is boy Alice is Bob";
		
		Map<String , Integer> hashMap = new HashMap<>();
		
		 // Splitting the words of string
        // and storing them in the array.
		String[] words = str.split(" ");
		
		//checking the word array;
		for(String word : words)	
		{
//			System.out.print(e + " ");
			
			// integer containing null
			Integer integer = hashMap.get(word);
			
			
			
			if(integer == null)
			{
				hashMap.put(word, 1);
				
			
			}
			else
			{
				hashMap.put(word, integer + 1);
			}
			
		}
		System.out.println("Givin String before sorted");
		System.out.println(hashMap);
		System.out.println();
		
		  List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
	      Collections.sort(list, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

	       System.out.println(list);

			
			
		}
		
		
		
		

	}


