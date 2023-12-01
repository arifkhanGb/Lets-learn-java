package day_9_10;

import java.util.HashMap;
import java.util.Map;

/*
 Exercise 6: Country-Capital Mapping
Create a Java program that uses a HashMap to map countries to their capitals.
 Implement functions to add new mappings, retrieve capitals by specifying a country, and 
 list all countries and capitals.

*/
public class Question_6 {

	public static void main(String[] args) {
		Map<String , String> map = new HashMap<>();
		
		map.put("India", "Delhi");
		map.put("Indonesia", "zakarta");
		map.put("America", "London");
		
		System.out.println("showing contry with their capitals");
		//System.out.println(map);
		
		
//		if(map.containsKey("India"))
//		{
//			System.out.println("Key exist");
//		}
		
		for(Map.Entry<String , String > e : map.entrySet())
		{
			if(map.containsKey("India"))
			{
			
				System.out.println(e.getKey()+": "+e.getValue());
				
			}
		}
		//get capital name using country
		System.out.println(map.get("India"));
	}

}
