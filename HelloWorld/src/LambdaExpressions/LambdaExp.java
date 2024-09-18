package LambdaExpressions;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee2{
	
	String ename;
	int salary;
	String gender;
	
	Employee2(String ename, int salary, String gender){
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}

	public String getEname() {
		return ename;
	}

//	public void setEname(String ename) {
//		this.ename = ename;
//	}

	public int getSalary() {
		return salary;
	}

//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
	
	
}

public class LambdaExp {

	public static void main(String[] args) {

		List<Employee2> emplist = new ArrayList<>();
		emplist.add(new Employee2("John", 15000, "Male"));
		emplist.add(new Employee2("Scott", 25000, "Male"));
		emplist.add(new Employee2("Mary", 50000, "Female"));
		emplist.add(new Employee2("Amanda", 35000, "Female"));
		emplist.add(new Employee2("Rich", 100000, "Male"));

		Function<Employee2, Integer> f = e -> e.salary * 10 / 100; // apply()

		Predicate<Integer> p = b -> b >= 5000; // test()

		Consumer<Employee2> c = e -> System.out.println
				("Name : " + e.ename + " Salary : " + 
		e.salary + " Gender : " + e.gender); // accept()
		
		Supplier<Date> s = () -> new Date();
		
		System.out.println(s.get());
		//Supplier get() - doesn't take any parameter and has return.

		for (Employee2 e : emplist) {

			int bonus = f.apply(e);
			if (p.test(bonus)) {
				c.accept(e);
				System.out.println("Bonus : " + bonus);
			}
		}

	}

}

//Iterator<Employee1> it = emplist.iterator();
//while(it.hasNext()) {
//	Employee1 emp = it.next();
//	System.out.println("Name : " + emp.ename + " Salary : " + emp.salary);
//}
