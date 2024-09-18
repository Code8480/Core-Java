package LambdaExpressions;

import java.util.function.Predicate;

public class PredicateMethod {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> (i>10);
		System.out.println(p.test(05));
		
		Predicate<String> s = i -> (i.length()>4);
		System.out.println(s.test("Java"));
		System.out.println(s.test("Welcome"));
		
		String names[] = {"David", "John", "Smith", "Jacob", "Mary"};
			for(String name : names) {
				if (s.test(name)) {
					System.out.println(name);
				}
			}
		
	}

}
