package practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = scanner.nextInt();
		
		int first =0, second = 1;
		
		  System.out.println("Fibonacci sequence: " + first + " " + second);
		
		for(int i = 2; i<num; i++) {
			int next = first + second;
			System.out.println(" " +next);
			first = second;
			second = next;
			
		}
		

	}

}
