package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctStream {

	public static void main(String[] args) {
		
		List<String> vehicle = new ArrayList<>(List.of("bus", "car","cycle",
				"bus","train", "flight", "car", "train"));
		
		List<String> newVehicleList = vehicle.stream().distinct().
				collect(Collectors.toList());
		System.out.println(newVehicleList);
		
		vehicle.stream().
			distinct().
			forEach(s -> System.out.println(s));
		
		long count = vehicle.stream().
		distinct().
		count();
		System.out.println(count);
		
		List<Integer> numberList = new ArrayList<>(List.of(2,4,5,7,8,9,20,49,68,78,8,10));
		
		long count1 = numberList.stream().
			filter(n -> n % 2 ==0).count();
		System.out.println(count1);
		
		numberList.stream().
				filter(n -> n % 2 ==0).forEach(n -> System.out.println(n));
		
		Optional<Integer> min = numberList.stream().min((a,b) -> {return a.compareTo(b);});
		
		System.out.println(min.get());
		
		 Optional<Integer> max = numberList.stream().max((a,b) -> {return a.compareTo(b);});
		 System.out.println(max.get());
		 
		 List<String> randomList = new ArrayList<>(List.of("A", "C","2","4","5","7","E"));
		 Optional<String> reducedList = randomList.stream().reduce((a, b) -> { return b+a; 
		 											});
		 System.out.println(reducedList);
	
	
	}
}
