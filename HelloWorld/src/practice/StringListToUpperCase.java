package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListToUpperCase {

	public static void main(String[] args) {
		
		List<String> slist = new ArrayList<>(Arrays.asList("Banana","Orange",
				"Mango","Guava","Apple","Guava","Banana","Orange"));
		
		List<String> ulist = new ArrayList<>();
		
		//Converting toUpper case using streams
		slist.stream().
		map(u -> u.toUpperCase()).
		forEach(u -> System.out.println(u));
		
		ulist = slist.stream().
		map(u -> u.toUpperCase()).
		collect(Collectors.toList());
		
		System.out.println(ulist);
		
		//Removing duplicated using streams
//		ulist = slist.stream().distinct().collect(Collectors.toList());
		long count = slist.stream().distinct().count();
		System.out.println(count);
	}

}
