package Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentHM {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 3, 4, 5, 5, 2, 8, 10, 10, 10, 7, 15, 6, 2, 3, 4, 1, 0 };

		Map<Integer, Integer> hm = new HashMap<>();
		
		for(Integer i: numbers) {
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else
				hm.put(i, 1);
		}
		
		int maxVal = Collections.max(hm.values());
		System.out.println("Max Value is: "+maxVal);
		
		System.out.println("---------------------------------");
		
		int maxVal1 = hm.values().stream().max((a,b) -> Integer.compare(a,b)).orElse(Integer.MIN_VALUE);
		System.out.println("Max Val is: "+maxVal1);
		
		System.out.println("---------------------------------");
		
		int maxValue = 1; //Integer.MIN_VALUE;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>maxValue) {
				maxValue = entry.getValue();
			}
			
		}
		System.out.println("Max Value is: "+maxValue);

	}

}
