package Practice2;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scanner.next();
		
//		String s = "Hello World";
		
		String s1 = new StringBuilder(s).reverse().toString();
		System.out.println("Reversed String is: "+s1);
	}

}
