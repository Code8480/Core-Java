package devtraining;

public class FirstProgram {
	
	public static void main(String[] args) {
		
		
		 int number = 13;
	        boolean isPrime = true;
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        System.out.println(number + " is prime: " + isPrime); 
		
		int num = 5;
	        int factorial = 1;
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }
	        System.out.println("Factorial of " + num + ": " + factorial);
		
		int d = 10;
		int e = 25;
		int f = 30;
		
		if((d < e) && (e < f)) {
			System.out.println("Both cnditions are met");
		} else {
			System.out.println("Conditions are not mey");
		}
		
			getSum();
			int s = getSum1();
			System.out.println(s);
//			System.out.println(getSum1());
			System.out.println(getSum2(30,50,25));
			
			System.out.println(getReminder(11,2));
	}
	
	public static void getSum() {
		int a =30;
		int b = 50;
		int sum = a+b;
//		System.out.println(sum);
	}
	
	public static int getSum1() {
		int a =30;
		int b = 50;
		int sum = a+b;
		return sum;
	}
	
	public static int getSum2(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	
	public static int getReminder(int a, int b) {
		int r = a%b;
		return r;
	}
}
