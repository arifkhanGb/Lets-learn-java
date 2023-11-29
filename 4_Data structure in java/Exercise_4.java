package day_9_10;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
public class Exercise_4 {

	public static void main(String[] args) {
			
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println("representing a set");
		System.out.println(set);
		
		System.out.println();
		
		TreeMap<String, String> map = new TreeMap<>();
		map.put("India" , "Delhi");
		map.put("Germany" , "Berlin");
		map.put("Indonesia" , "Jakarta");
		
		System.out.println("some Key-value pairs by TreeMap");
		System.out.println(map);
	}

}
