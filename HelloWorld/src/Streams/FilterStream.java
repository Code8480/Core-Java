package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {

	public static void main(String[] args) {
		
		List<Integer> intlist = new ArrayList<>(List.of(5,10,12,56,90,100,5,108,43,21,
				2,8,10));
		List sortedList = new ArrayList<>();
		
		intlist.
		stream().
		filter(n -> n%2 ==0).
		forEach( n -> System.out.println(n));
		
		sortedList = intlist.
				stream().
				filter(n -> n%2 == 0).
				collect(Collectors.toList());
		System.out.println(sortedList);
		
		intlist.stream().filter(n -> n%2 !=0).forEach( n -> System.out.println(n));
		sortedList = intlist.stream().filter(n -> n%2 !=0).collect(Collectors.toList());
		System.out.println(sortedList);

	}

}
