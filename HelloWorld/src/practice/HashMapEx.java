package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> studentGrades = new HashMap<>();
		studentGrades.put("John", 92);
		studentGrades.put("Patrick", 100);
		studentGrades.put("Mary", 75);
		studentGrades.put("Kim", 65);
		studentGrades.put("Smith", 55);
		studentGrades.put("Jason", 85);
		
		for( Map.Entry<String, Integer> entry :studentGrades.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());;
		}
		
		if(studentGrades.containsKey("John")) {
			System.out.println("Grades: "+studentGrades.get("John"));
		}

	}

}
