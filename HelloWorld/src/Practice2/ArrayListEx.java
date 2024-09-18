package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>(Arrays.asList("Orange", "Apple", "Mango",
				"Guava","Banana","Apple","Orange"));
		
		List<String> fruits1 = new ArrayList<>(List.of("Orange", "Apple", "Mango",
				"Guava","Banana","Apple","Orange"));
		fruits1.add("Grapes");
		
		System.out.println("List is: "+ fruits1.get(1));
		fruits1.remove("Grapes");
		
		for(String s:fruits1) {
			System.out.println(s);
		}
		
		Iterator<String> it = fruits1.iterator();
		while(it.hasNext()) {
			System.out.println("Printing: "+ it.next());
		}

	}

}
