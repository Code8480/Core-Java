package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListSumLambda {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum = numbers.stream().reduce(0, (a , b) -> a + b);
		
		System.out.println("Sum "+sum);
		
		List<Integer> numbers1 = Arrays.asList(5, 3, 9, 2, 8);
		
		Optional<Integer> max = numbers1.stream().max((a,b) -> Integer.compare(a,b));
		
		System.out.println("Max no "+max);
		
		List<String> names = Arrays.asList("Tom", "Alice", "Bob", "Charlie");
		
		long count = names.stream().filter(s -> s.length()>3).count();
//		forEach(s -> System.out.println(s));
		
		System.out.println("Count "+count);

	}

}
