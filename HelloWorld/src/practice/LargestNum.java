package practice;

public class LargestNum {

	public static void main(String[] args) {
		
		int[] num = {2,12,4,5,0,78,9,4,5,6,8};
		int max = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i] > max) {
			max= num[i];
		}

	}
		System.err.println("Max # is: "+max);

}

}