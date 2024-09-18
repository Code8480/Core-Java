package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEven {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> elist = new ArrayList<>();
		
		numbers.stream().filter(i -> i % 2 ==0).forEach(i -> System.out.println(i));
		elist = numbers.stream().filter(i -> i % 2 ==0).collect(Collectors.toList());
		System.out.println("Printing even numbers "+elist);

	}

}

