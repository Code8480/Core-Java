package devtraining;

public class ControlFlow {
	
	public static void main(String[] args) {
		
		int grade = 65;
		if (grade >= 90) {
		    System.out.println("Excellent!");
		} else if (grade >= 80) {
		    System.out.println("Very good!");
		} else {
		    System.out.println("Good effort.");
		}
		
		String day = "Wednesday";
		switch (day) {
		    case "Monday":
		        System.out.println("Start of the week!");
		        break;
		    case "Tuesday":
		    case "Wednesday":
		    case "Thursday":
		        System.out.println("Weekday grind...");
		        break;
		    case "Friday":
		        System.out.println("Almost weekend!");
		        break;
		    default:
		        System.out.println("Enjoy the weekend!");
		}

	}

}
