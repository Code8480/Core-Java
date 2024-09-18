package Practice2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int a = scanner.nextInt();
		int factorial = 1;
		for(int i = 2; i<=a; i++) {
			factorial *= i;
		}
		
		System.out.println("Factorial of a is: "+ factorial);

	}

}
