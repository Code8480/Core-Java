package LambdaExpressions;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = n -> n*n;
		Function<Integer, Integer> f1 = n -> n*n*n;
		System.out.println(f.andThen(f1).apply(2));
		System.out.println(f.compose(f1).apply(10));
//		System.out.println(f.apply(3));
//		
//		Function<String, Integer> f1 = s -> s.length();
//		System.out.println(f1.apply("Welcome"));
//		System.out.println(f1.apply("Python"));
		
}

}
