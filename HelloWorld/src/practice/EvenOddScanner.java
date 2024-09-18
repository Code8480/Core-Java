package practice;

import java.util.Scanner;

public class EvenOddScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		evenOdd(num);
		
	}
	
	public static void evenOdd(int num) {
		
		if(num % 2 == 0) {
			System.out.println(num+ " is Even");
		} else {
			System.out.println(num+" is Odd");
		}
	}

}
