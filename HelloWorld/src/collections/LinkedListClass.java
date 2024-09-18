package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

public static void main(String[] args) {
	
	LinkedList<String> listNew = new LinkedList<>(
			List.of("X","Y","Z","A","B","C"));
	System.out.println(listNew);
	
	listNew.add("A");
	
	System.out.println(listNew);
	
	Collections.sort(listNew);
	
	System.out.println(listNew);
	
	Collections.sort(listNew, Collections.reverseOrder());
	
	System.out.println(listNew);
	
	LinkedList listNew1 = new LinkedList();
	listNew1.addAll(listNew);
	
	System.out.println(listNew1);
	
	System.out.println(listNew1.removeAll(listNew));
	
	System.out.println(listNew1);
		
		LinkedList ll = new LinkedList(
				List.of("Java", 5,10.5,"Python",'A'));
		ll.set(3, 'D');
		ll.add('A');
		for(Object i : ll) {
			System.out.println(i);
		}
		System.out.println(ll);
		System.out.println(ll.size());
		
		LinkedList<String> ll1 = new LinkedList<>(
				List.of("Java","Python","Computer Programming"));
//		Collection.sort(ll1);
		for(String i : ll1) {
			System.out.println(i);
		}
		System.out.println(ll1);
		System.out.println(ll1.size());
		
		
	}
}
