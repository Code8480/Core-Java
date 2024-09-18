package LambdaExpressions;

@FunctionalInterface
interface Cab
{
	public String bookCab(String source, String destination);
}

//class Ola implements Cab
//{
//	public String bookCab(String source, String destination) {	
//		System.out.println("Ola cab is booked from: "+source +" to "+destination);
//		return ("Price : 5000");
//	}	
//}

public class FirstLambdaExpression {

	public static void main(String[] args) {
		
//		Cab cab = new Ola();
		Cab cab = (source, destination) -> {System.out.println
				("Ola cab is booked from: "+source +" to "+destination); 
			return ("Price: 5000");};
//		Cab cab = () -> System.out.println("Ola cab is booked...");
		System.out.println(cab.bookCab("Chandigarh", "Delhi"));
		
	}
}
