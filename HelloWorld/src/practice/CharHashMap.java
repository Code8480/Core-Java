package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharHashMap {

	public static void main(String[] args) {
		
		String s = "Hello World";
		char[] cArray = s.toCharArray();
		System.out.println("Printing----"+Arrays.toString(cArray));
		
		Map<Character, Integer> charMap = new HashMap<>();
		for( char c : cArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		
		System.out.println("----------------");
		for (Map.Entry<Character, Integer> entry :charMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}

