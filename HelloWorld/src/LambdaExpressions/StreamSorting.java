package LambdaExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSorting {

	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<>(List.of(2,3,4,5,6,10,12,16,15,25));
		
		List<Integer> sortedList = numberList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> sortedList1 = numberList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		List<String> sList = new ArrayList<>(List.of("John","apple","mango", "Mary", "Tim", "David", "Smith"));
		List<String> ssList = sList.stream().sorted().collect(Collectors.toList());
		System.out.println(ssList);
		
		List<String> ssList1 = sList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ssList1);
		
		Set<String> setColl = new HashSet<>(List.of("One apple", "One mango", "Two apples", "More grapes", "Two guavas"));
		boolean result = setColl.stream().anyMatch(s -> {return s.startsWith("One");});
		System.out.println(result);
	}

}
