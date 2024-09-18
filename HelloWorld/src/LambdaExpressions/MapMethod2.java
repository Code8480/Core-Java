package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee5{
	
	int empid;
	public String name;
	int salary;
	
	Employee5(int empid, String name, int salary){
		this.empid =empid;
		this.name = name;
		this.salary = salary;
	  }
	}

public class MapMethod2 {

	public static void main(String[] args) {
		
//		List<Employee> emp = Arrays.asList(
//				new Employee (101,"Alex",20000),
//				new Employee (102,"James",225000),
//				new Employee (103,"Scott",30000),
//				new Employee (104,"David",40000),
//				new Employee (105,"Neptor",100000),
//				new Employee (106,"Rymeros",120000));
		
		List<Employee5> emp = new ArrayList<>(List.of(
				new Employee5 (101,"Alex",20000),
				new Employee5 (102,"James",225000),
				new Employee5 (103,"Scott",30000),
				new Employee5 (104,"David",40000),
				new Employee5 (105,"Neptor",100000),
				new Employee5 (106,"Rymeros",120000)));
		
		List<Integer> empNew = new ArrayList<>();
		
	empNew =emp.stream().
			filter(e -> e.salary > 50000).
			map(e -> e.salary * 10/100).
			collect(Collectors.toList());
	
	System.out.println(empNew);
	
//	emp.stream().
//	filter(e -> e.salary > 50000).
//	map(e -> e.salary * 10/100).
//	forEach(e -> System.out.println(e.);
		
		
		
		
		
		
		
		List<Integer> numberList = Arrays.asList(2,3,4,5,6);
		
		List<Integer> newList = new ArrayList<>();
		
		numberList.stream().map(n -> n*3).forEach(n -> System.out.println(n));
		
		newList = numberList.stream().map(n -> n*3).collect(Collectors.toList());
		
		System.out.println(newList);

	}

}
