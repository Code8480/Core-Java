package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	
	String ename;
	int salary;
	int experience;
	
	Employee (String name, int sal, int exp){
		
		ename = name;
		salary = sal;
		experience = exp;
	}
}

public class Demo2 {
	
	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("John", 50000, 5));
		employee.add(new Employee("Scott", 60000, 6));
		employee.add(new Employee("Sam", 7000, 2));
		employee.add(new Employee("Smith", 950000, 15));
		
		Predicate<Employee> pr = e -> (e.salary>30000 && e.experience >3);
		
		for(Employee e:employee) {
			if(pr.test(e)) {
		System.out.println(e.ename+ " " +e.salary);
		}
		}
	}
	
}
