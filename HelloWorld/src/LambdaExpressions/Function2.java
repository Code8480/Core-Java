package LambdaExpressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{
	
	String ename;
	int salary;
	
	Employee1(String ename, int salary){
		this.ename = ename;
		this.salary = salary;
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

public class Function2 {

	public static void main(String[] args) {
		
		List<Employee1> emplist = new ArrayList<>();
		emplist.add(new Employee1("John", 15000));
		emplist.add(new Employee1("Scott", 25000));
		emplist.add(new Employee1("Mary", 5000));
		emplist.add(new Employee1("David", 35000));
		emplist.add(new Employee1("Rich", 100000));
		
		Function<Employee1, Integer> f = e -> {
			int sal = e.salary;
			if(sal >= 10000 && sal <= 20000)
				return (sal * 10/100);
			else if (sal >20000 && sal <= 30000)
				return (sal * 20/100);
				else if (sal >30000 && sal <= 50000)
					return (sal * 30/100);
					else 
						return (sal * 40/100);
			};
			
			Predicate<Integer> p = b -> b>5000;
		
		for(Employee1 e : emplist) {
//			Iterator<Employee1> it = emplist.iterator();
//			while(it.hasNext()) {
//				Employee1 emp = it.next();
//				System.out.println("Name : " + emp.ename + " Salary : " + emp.salary);
//			}
			int bonus = f.apply(e);
			if(p.test(bonus))
			{
			System.out.println("Name : " + e.ename + " Salary : " + e.salary);
			System.out.println("Bonus : " + bonus);
			}
		}
		
		

	}

}
