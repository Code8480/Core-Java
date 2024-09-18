package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		System.out.println("Factorial of "+num+" is "+factorial(num));
		}catch(Exception E) {
			System.out.println("Invalid Input");
		}		

	}
	
	public static int factorial(int num) {
		
		int factorial = 1;
		for (int i = 1; i<=num; i++) {
			factorial *=i;
		}
		return factorial;
	}

}
