package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListHashMap {

	public static void main(String[] args) {
		List<String> slist = new ArrayList<>(Arrays.asList("Apple", "Orange", 
				"Mango", "Apple", "Banana", "Orange",
				"Kiwi", "Mango", "Apple", "Banana"));
		Map<String, Integer> fmap = new HashMap<>();
		
		List<Integer> elist = new ArrayList<>();

		for (String s : slist) {
			if (fmap.containsKey(s)) {
				fmap.put(s, fmap.get(s) + 1);
			} else {
				fmap.put(s, 1);
			}
		}

		for (Map.Entry<String, Integer> entry : fmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//Converting HashMap values to list
		for (Map.Entry<String, Integer> entry : fmap.entrySet()) {
			elist.add(entry.getValue());
//			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println(elist);
		
		//Inverting HashMap
		Map<Integer, String> imap = new HashMap<>();
		for (Map.Entry<String, Integer> entry : fmap.entrySet()) {
			imap.put(entry.getValue(), entry.getKey());
		}
		for(Map.Entry<Integer, String> entry : imap.entrySet()) {
		System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
