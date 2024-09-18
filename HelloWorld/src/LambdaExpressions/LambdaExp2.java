package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee20{
	
	String ename;
	int salary;
	String gender;
	
	Employee20(String ename, int salary, String gender){
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
	
}

public class LambdaExp2 {

	public static void main(String[] args) {
		
		List<Employee20> emplist = new ArrayList<>(List.of(
		new Employee20("John", 45000, "Male"),
		new Employee20("Scott", 25000, "Male"),
		new Employee20("Mary", 150000, "Female"),
		new Employee20("Amanda", 135000, "Female"),
		new Employee20("Rich", 100000, "Male")));
		
		Function<Employee20, Integer> f = e -> e.salary * 10/100; //apply()
		Predicate<Integer> p = e -> e > 5000; // test()
		Consumer<Employee20> c = e -> System.out.println("Ename: " + e.ename  
				+" Salary: " + e.salary + " Gender " + e.gender); //accept()
		
		for(Employee20 obj: emplist) {
			int bonus = f.apply(obj);
			if(p.test(bonus)) {
				c.accept(obj);
				System.out.println("Bonus: "+ bonus);
			}
		}
	}

}
