package Practice2;

import java.util.Scanner;

public class PrineNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int a = scanner.nextInt();
		
		boolean isPrime = true;
		
		for(int i = 2; i <= a/2; i++) {
			if(a % i == 0) {
			isPrime = false;
			break; //break is used to exit the loop
			}
			
		}
		if(isPrime && a > 1)
			System.out.println(a +" is a Prime number");
		else
			System.out.println(a + " is not a Prime number");
		
			
	}

}
