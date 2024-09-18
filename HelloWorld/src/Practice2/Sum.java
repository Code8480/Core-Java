package Practice2;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int b = scanner.nextInt();
		int sum = a+b;
		System.out.println("Sum is: "+ sum);
	}

}

