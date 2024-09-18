package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
//		String s = "Welcome";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s = scanner.next();
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse().toString());

	}

}
