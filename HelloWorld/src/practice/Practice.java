package practice;

public class Practice {

	public static void main(String[] args) {
		
		System.out.println(stringReverse("Hello World"));
		String s1 = "Hello World";
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println(sb1.reverse());
	}
	
	public static String stringReverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

}
