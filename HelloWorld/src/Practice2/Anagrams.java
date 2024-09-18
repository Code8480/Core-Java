package Practice2;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		
		String s1 = "listen";
		String s2 = "silent";
		String s3 = new StringBuffer().append(s1).append(s2).toString();
//		System.out.println(s3);
		
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
		char[] c3 = s3.toCharArray();
		
//		HashMap<Character, Integer> hm1 = new HashMap<>();
//		HashMap<Character, Integer> hm2 = new HashMap<>();
		HashMap<Character, Integer> hm3 = new HashMap<>();
		
		for(Character c : c3) {
			if(hm3.containsKey(c)) 
				hm3.put(c, hm3.get(c)+1);
			else
				hm3.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer> entry : hm3.entrySet()) {
			if(entry.getValue()!=2)
				System.out.println("Strings are not Anagrams");
			else
				System.out.println("Strings are Anagrams");
		}

	}

}
