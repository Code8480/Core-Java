package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		
		String sentence = "Hello Java World! Welcome to Java."
				+ " Java is a very interesting programming language";
		
		String[] word = sentence.split("[\\p{Punct}\\s]+");
//		System.out.println(Arrays.toString(word));//To print an array use Arrays.toString or for loop

		
		Map<String, Integer> wordcount = new HashMap<>();
		
		for(String w:word) {
			if(wordcount.containsKey(w)) {
			wordcount.put(w, wordcount.get(w)+1);
//			System.out.println(wordcount.get(w));
		} else {
			wordcount.put(w, 1);
//			System.out.println(wordcount.get(w));
		}
		
		}
		
		for(Map.Entry<String, Integer> entry : wordcount.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
