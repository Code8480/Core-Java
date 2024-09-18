package Practice2;

import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Grade");
		int grade = scanner.nextInt();
		
		char g;
		
//		if(grade > 90)
//			g = 'A';
//		else if(grade > 80 && grade <= 90)
//			g = 'B';
//		else if(grade > 70 && grade <= 80)
//			g = 'C';
//		else if(grade > 60 && grade <= 70)
//			g = 'D';
//		else if(grade > 50 && grade <= 60)
//			g = 'E';
//		else
//			g ='F';
		
		switch(grade / 10) {
		
		case 10:
		case 9 :
			g = 'A';
			break;
		case 8:
			g = 'B';
			break;
		case 7:
			g = 'C';
			break;
		case 6:
			g ='D';
			break;
		case 5:
			g ='E';
			break;
			default :
				g ='F';
				break;
					
		}
		
		System.out.println("Grade is: "+g);
	}

}
