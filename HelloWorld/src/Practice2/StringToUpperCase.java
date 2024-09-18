package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		
		List<String> uNames = new ArrayList<>();
		
		names.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println("Upper case "+s));
		uNames = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Upper case "+uNames);
	}

}
