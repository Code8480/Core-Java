package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

	public static void main(String[] args) {

		List<String> vehicle = Arrays.asList("bus", "car", "cycle", "flight", "train");

		List<String> vehicleUpperCase = new ArrayList<String>();
		List<Integer> vehicleUpperCase1 = new ArrayList<>();

		// Without using Streams
//		for(String s:vehicle) {
//			vehicleUpperCase.add(s.toUpperCase()); //to add to a new list after converting in upper case
//		}
//		
//		System.out.println(vehicleUpperCase);

		// Using Streams
//		vehicle.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
//		vehicleUpperCase = vehicle.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		vehicle.stream().map(s -> s.length()).forEach(s -> System.out.println(s));
		vehicleUpperCase1 = vehicle.stream().map(s -> s.length()).collect(Collectors.toList());
		
		System.out.println(vehicleUpperCase1);

	}

}
