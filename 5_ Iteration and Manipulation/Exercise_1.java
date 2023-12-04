package Day_11_12;
import java.awt.RenderingHints.Key;
import java.util.*;
import java.util.Map.Entry;


class Key_value{
	
	public void K_V() {
		try {
	Map<String , Integer> m = new HashMap<>();
	m.put("A", 1);
	m.put("B", 2);
	m.put("C", 3);
	
	m.put("A", 23);// value will be updated on key "A"
	m.remove("A");// this pair will be removed.
	
	Integer a = m.get("B");
	System.out.println(a);
	System.out.println(m);
	
	
//	for(Entry<String, Integer> e : m.entrySet())
//	{
//		System.out.println(e.getKey() +" = " + e.getValue());
//	}
//	
	
	
	}catch(InputMismatchException e) {
		System.out.println(e);
	}
		
	}
}


public class Exercise_1 {

	public static void main(String[] args) {
		Key_value obj = new Key_value();
		obj.K_V();

	}

}
