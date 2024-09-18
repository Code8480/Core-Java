package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		List al = new ArrayList(
				List.of("Java", 5,10.5,"Python",'A'));
		System.out.println(al);
		
		List<String> al1 = new ArrayList<>(
				List.of("Java","Python"));
		al1.add(2,"Computer Programming");
		al1.add(1,"Mathematics");
		System.out.println(al1);
		
		String[] fruit = {"Mango", "Banana", "Apple", "Grapes"};
		List arList = Arrays.asList(fruit);//Unmodifiable List backed by Array
		List<String> arList1 = new ArrayList<>(arList); // Modifiable List backed by ArrayList
		arList1.add("Peach");
		
		System.out.println(arList);
		System.out.println(arList1);
		
		for(String s :arList1) {
			System.out.println(s);
		}
		
		Iterator<String> it = arList1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
		
	}

}
