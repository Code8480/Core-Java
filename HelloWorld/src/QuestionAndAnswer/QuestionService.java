package QuestionAndAnswer;

import java.util.Scanner;

public class QuestionService {
	
	Question[] questions = new Question[5];
	String selection[] = new String[5];
	
	public void playQuiz() {
		int i=0;
		for(Question question : questions) {
		System.out.println("Question id :"+question.getId());
		System.out.println("Question :"+question.getQuestion());
		System.out.println("Option 1 :"+question.getOpt1());
		System.out.println("Option 2 :"+question.getOpt2());
		System.out.println("Option 3 :"+question.getOpt3());
		System.out.println("Option 4 :"+question.getOpt4());
		
		Scanner scanner = new Scanner(System.in);
		selection[i] = scanner.nextLine();
		i++;
		}
		
		for(String s : selection) {
			System.out.println(s);
		}
	}

	public QuestionService() {
		 questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
	        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
	        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
	        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
	        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");

	}
}
