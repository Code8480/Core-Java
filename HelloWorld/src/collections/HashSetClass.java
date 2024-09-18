package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetClass {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet(List.of("Java", 100,'A',10.5)); //default capacity is 16 and LF is .75
//		HashSet<String> hs1 = new HashSet<>(100);
		hs.add("Python");
		System.out.println(hs); //printed in random order
		
		System.out.println(hs.contains("Java"));
		
		for(Object i : hs) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
