package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee12{
	
	String ename;
	int salary;
	
	Employee12(String ename, int salary){
		this.ename = ename;
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public int getSalary() {
		return salary;
	}

//	public void setEname(String ename) {
//		this.ename = ename;
//	}

//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
	
	
}

public class FunctionLambda {
	
	public static void main(String[] args) {
		
		List<Employee12> emplist = new ArrayList<>();
		emplist.add(new Employee12("John", 75000));
		emplist.add(new Employee12("Smith", 125000));
		emplist.add(new Employee12("Patrick", 55000));
		emplist.add(new Employee12("Mary", 90000));
		emplist.add(new Employee12("jamie", 40000));
		emplist.add(new Employee12("Jack", 140000));
		
		Predicate<Integer> pr = p -> p > 7500;
		
		Function <Employee12, Integer> f = b -> {
			if(b.salary >= 60000 && b.salary <= 80000) 
				return b.salary * 10/100;
			else if(b.salary > 80000 && b.salary <= 100000)
				return b.salary*20/100;
			else
			return b.salary * 25/100;
		};
		
		for( Employee12 obj:emplist) {
			int bonus = f.apply(obj);
			if(pr.test(bonus)) {
			System.out.println("Ename : " + obj.ename + " Salary " + obj.salary + " Bonus " + bonus);
		}
		}
				
	}

}
