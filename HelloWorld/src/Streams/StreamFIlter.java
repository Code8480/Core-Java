package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFIlter {

	public static void main(String[] args) {

//		ArrayList<Integer> numbersList = new ArrayList<>();
//		numbersList.add(10);
//		numbersList.add(15);
//		numbersList.add(20);
//		numbersList.add(25);
//		numbersList.add(30);
//		numbersList.add(35);

		List<Integer> numbersList = new ArrayList<>(List.of(10, 15, 20, 25, 30, 35));
//		System.out.println(numbersList);
		List<Integer> evenList = new ArrayList<>();

		List<String> nameList = new ArrayList<>(
				List.of("James", "Scott", "Manvind", "Marypet", "Edgewood", "Rockydepno"));
		List<String> filteredList = new ArrayList<>();

//		for(int n :numbersList) {
//			if (n % 2 ==0) {
//				evenList.add(n);
//			}
//		}
//		System.out.println(evenList);

//		evenList = numbersList.
//		stream().
//		filter(n -> n % 2 == 0).
//		collect(Collectors.toList());

		filteredList = nameList.stream().filter(s -> (s.length() > 6 && s.length() < 8)).collect(Collectors.toList());
		System.out.println(filteredList);

		nameList.stream().filter(s -> (s.length() > 6 && s.length() < 8)).forEach(s -> System.out.println(s));

		numbersList.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		System.out.println(evenList);
		
//		List<String> words = new ArrayList<>(
//				List.of("James", "", "Manvind", "Marypet", "Edgewood", ""));
//		
		List<String> words = Arrays.asList
				("James", null, "Manvind", "Marypet", "Edgewood", null);
		
		List<String> wordsNew = new ArrayList<>();
		
		wordsNew = words.stream().filter(s -> s!=null).collect(Collectors.toList());
		System.out.println(wordsNew);
		words.stream().filter(s -> s!=null).forEach(s -> System.out.println(s));
				
	}

}
