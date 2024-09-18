package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		System.out.println(hm);
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(101, "Java");
		hm1.put(102, "Python");
		hm1.put(103, "Mathematics");
		hm1.put(104, "C Programming");
		hm1.put(110, "SQL");
		
		System.out.println(hm1);
		hm1.put(103, "Rust");
		System.out.println(hm1);
		System.out.println("Value = " + hm1.get(102));
		System.out.println("Does it contain key = " + hm1.containsKey(110));
		System.out.println("Does it contain value = " + hm1.containsValue("Java"));
		
		for(int i : hm1.keySet()) {
			System.out.println(i);
		}
		
		for(String s : hm1.values()) {
			System.out.println(s);
		}
		
//		Iterator it = ((Object) hm1).ListIterator();
		Set s = hm1.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()){
			Map.Entry entry= (Entry)it.next();
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		
		for(Map.Entry entry : hm1.entrySet()) {
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		
		
		
//		System.out.println("Key Set = " + hm1.keySet());
//		System.out.println("Entry Set = " + hm1.entrySet());
		
		
	}

}
