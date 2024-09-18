package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		
			if(isPrimeNumber(num)) {
				System.out.println(num+ " is a Prime number");
			}else {
				System.out.println(num+ " is not a Prime number");
			}

	}
	
	public static boolean isPrimeNumber(int num) {
		
		boolean isPrime = true;
		if(num<=1) {
			isPrime = false;
		}else {
			for(int i = 2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		return isPrime;
		
	}

}
