package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import practice.Student;

public class HashMapArrayList {

	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		String[] slist = {"Java", "Python", "Csharp","React"};
		
		for(String string : slist) {
			System.out.println(string);
		}
		
		Map<String,ArrayList<String>> student = new HashMap<>();
		
		student.put("John",new ArrayList(Arrays.asList("Java", "Python","C")));
		student.put("Smith",new ArrayList(Arrays.asList("Maths", "Physics","Chemistry")));
		student.put("Kim",new ArrayList(Arrays.asList("PO", "PM","C++")));
		
		if(student.containsKey("Kim"))
			System.out.println(student.get("Kim"));
		else
			System.out.println("Student not found");
		
		for(Map.Entry<String, ArrayList<String>> entry : student.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}

	}

}
