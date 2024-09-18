package practice;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String s = "madam";
//		StringBuilder sb = new StringBuilder(s);
		String s1 = new StringBuilder(s).reverse().toString();
		
		if(s.equals(s1)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}
	}

}
