package practice;

public class StringtoArray {

	public static void main(String[] args) {
		
		String s = "Welcome";
		char[] cha = s.toCharArray();
		
		for(char c:cha) {
		System.out.println(c);
		}
		
		System.out.println("------------------------------------");
		
		for(int i=cha.length-1; i>=0;i-- ) {
			System.out.println(cha[i]);
		}
	}

}
