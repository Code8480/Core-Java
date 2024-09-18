package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
		
		List<List<Integer>> finalList1 = new ArrayList<>(List.of(list1, list2, list3));
		
		System.out.println(finalList1);
		
		List<Integer> finalResults = finalList1.stream().
				flatMap(l -> l.stream()).
				filter(n -> n>=3).
				map(n -> n+10).
				collect(Collectors.toList());
		
		System.out.println(finalResults);
		
		List<String> team1 = new ArrayList<>(List.of("David", "Mark", "Someone"));
		List<String> team2 = new ArrayList<>(List.of("Mary", "Luna", "Suzuki"));
		List<String> team3 = new ArrayList<>(List.of("Scottish", "Hong", "Kitty"));
		
		List<List<String>> worldCupPlayers = new ArrayList<>(List.of(team1, team2, team3));
		
		List<String> newList = new ArrayList<>();
		
		newList = worldCupPlayers.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
			System.out.println(newList);
		
		//Before Java 8
//		for(List<String> team : worldCupPlayers) {
//			
//			for (var name :team) {
//				System.out.println(name);
//			}
//		}
//		
	}

}
