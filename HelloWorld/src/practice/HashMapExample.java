package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> fruit = new HashMap<>();
		fruit.put("Apples", 10);
		fruit.put("Bananas", 12);
		fruit.put("Oranges", 15);
		fruit.put("Strawberries", 20);

//		try {
//			int a = fruit.get("Applee");
//		}catch(NullPointerException e) {
//			System.out.println("An error occured");
//			e.printStackTrace();
//		}
		
		int apples = fruit.get("Apples");
		System.out.println("Count of Apples = "+apples);
		
		if(fruit.containsKey("Bananas")) {
			System.out.println("Banana is present in the map");
		}
		
		for(Map.Entry<String, Integer> entry : fruit.entrySet()) {
			System.err.println(entry.getKey()+ "-"+entry.getValue());
		}
			
		System.out.println("Map Size: " + fruit.size());
		
		System.out.println("Count of Oranges Removed: "+ fruit.remove("Oranges"));

	}

}
