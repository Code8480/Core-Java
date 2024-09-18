package Practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateArrayHM {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,3,4,5,5,2,8,10,10,10,7,15,6,2,3,4,1,0};
		
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(Integer i:numbers) {
			if(hm.containsKey(i)) {
			hm.put(i, hm.get(i)+1);
			} else
				hm.put(i, 1);
		}
		
		List<Integer> duplicateValues = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				duplicateValues.add(entry.getKey());
			}
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
		System.out.println("Duplicate values are: "+ duplicateValues);

	}

}
