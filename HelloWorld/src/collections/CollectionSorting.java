package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		
		List<Student15> student = new ArrayList<>(List.of(
				new Student15(106, "John", "Smith", 21),
				new Student15(102, "Mary", "Ann", 23),
				new Student15(104, "Petro", "King", 27),
				new Student15(105, "Hamp", "Romi", 29),
				new Student15(100, "Scott", "Nelson", 20),
				new Student15(103, "Rich", "Danay", 17)));
		
//		Collections.sort(student);
		
		Collections.sort(student, new CollectionComaparator());
		
		for(Student15 l : student) {
			System.out.println(l);
		}

	}

}
