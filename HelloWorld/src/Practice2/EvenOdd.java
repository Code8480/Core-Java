package Practice2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int a = scanner.nextInt();
		if(a%2 == 0)
			System.out.println(a +" is an even number");
		else
			System.out.println(a +" is an odd number");

	}

}
