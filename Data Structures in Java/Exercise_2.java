package day_9_10;

import java.util.ArrayList;

public class Exercise_2 {

	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<>();
		student.add("jack");
		student.add("sparrow");
		student.add("mick");
		student.add("luccy");
		
		System.out.println("Add student in the list");
		System.out.println(student);
		System.out.println();
		
		System.out.println("student remove from the list");
		student.remove(0);
		System.out.println(student);
		
		
		

	}

}
