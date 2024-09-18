package Exceptions;

import java.util.Scanner;

public class ExceptionClass {
	
	public static void main(String[] args) {
		
		System.out.println("Programming has started");
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int num = scanner.nextInt();
//		System.out.println((float)100/num);
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a position[0-4]: ");
		int pos = sc.nextInt();
		System.out.println("Enter value");
		int val = sc.nextInt();
		a[pos] = val;
		System.out.println(a[pos]);
		
		
		System.out.println("Program has completed");
		System.out.println("Program is exited");
	}

}
