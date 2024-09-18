package Practice2;

public class ArrLargest {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 6, 7, 99, 6, 7, 0, 5 };

		int maxNum = numbers[0];
		int maxIndex=1;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxNum) {
				maxNum = numbers[i];
				maxIndex = i;
			}

		}
		System.out.println("Max number " + maxNum + " is @ index " + maxIndex);

		System.out.println("Array Length: " + numbers.length);
	}

}
