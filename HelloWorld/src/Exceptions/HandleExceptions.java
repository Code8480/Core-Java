package Exceptions;

import java.util.Scanner;

public class HandleExceptions {
	
	public static void main(String[] args) {
		
System.out.println("Programming has started");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		try {
		System.out.println(100/num);
		} catch(Exception e)
		{
			System.out.println("Invalid Data...");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program has completed");
		System.out.println("Program is exited");
	}

}
