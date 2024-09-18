package collections;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetClass {
	
	public static void main(String[] args) {
		
//		TreeSet ts = new TreeSet();
		TreeSet<Integer> ts = new TreeSet<Integer>(List.of(1,7,8,9,44,67,5,0,56,78,0));
		
		System.out.println(ts);
		
		ts.add(5);
		
		System.out.println(ts);
		
		Object[] objArray = ts.toArray();
		for (Object o : objArray){
			Integer value = (Integer)o;
			
			System.out.println(value);
		}
		
		
		for(int i : ts) {
			
			System.out.println(i);
		}
		
		System.out.println("----------------");
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
