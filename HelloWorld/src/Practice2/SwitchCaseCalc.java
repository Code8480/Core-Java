package Practice2;

import java.util.Scanner;

public class SwitchCaseCalc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter 2nd number: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Enter operator ");
		char c = scanner.next().charAt(0);
		
		double result;
		
		switch(c) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + "+num2+ " = "+ result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - "+num2+ " = "+ result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * "+num2+ " = "+ result);
			break;
		case '/':
			result = num1 / num2;
			if(num2 > 0) {
			System.out.println(num1 + " / "+num2+ " = "+ result);
			}else
			System.out.println("Error! Divison by 0 not allowed");
			break;
			default:
			System.out.println("Invalid Operator");
			break;
		}

	}

}
