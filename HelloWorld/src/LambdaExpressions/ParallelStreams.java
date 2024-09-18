package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

class Student9{
	
	String name;
	int score;
	
	Student9(String name, int score){
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

		public int getScore() {
		return this.score;
	}

		
}

public class ParallelStreams {

	public static void main(String[] args) {
		
		List<Student9> stu = new ArrayList<>(List.of(
				new Student9 ("Alex", 321),
				new Student9 ("Jack", 325),
				new Student9 ("Mary", 600),
				new Student9 ("Petro", 75),
				new Student9 ("Michael", 165),
				new Student9 ("Frank", 24)));
		
		//Using Streams - Sequential processing
		stu.stream().
			filter(s -> s.score>=125).
			limit(3).
			forEach(s -> System.out.println(s.getName() + " " + s.getScore()));
		
		//Using Parallel Streams - Parallel processing		
		stu.parallelStream().
		filter(s -> s.score>=125).
		limit(3).
		forEach(s -> System.out.println(s.getName() + " " + s.getScore()));
		
		//Converting Stream into a parallel stream		
		stu.stream().parallel().
		filter(s -> s.score>=125).
		limit(3).
		forEach(s -> System.out.println(s.getName() + " " + s.getScore()));

	}

}
