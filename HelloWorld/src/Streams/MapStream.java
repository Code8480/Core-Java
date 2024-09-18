package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	int empid;
	String empname;
	int salary;
	
	Employee(int empid, String empname, int salary){
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
}

public class MapStream {

	public static void main(String[] args) {
		
//		List<String> vehicle = new ArrayList<>(List.of("Car", "Bus", "Truck","Plane","Train"));
//		
//		vehicle.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
//		List<String> upperVehicle = new ArrayList<>();
//		upperVehicle = vehicle.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
//		System.out.println(upperVehicle);
		
		List<Integer> filterempList = new ArrayList<>();
		
		List<Employee> empList = new ArrayList<>(List.of(
				new Employee(101, "John", 50000),
				new Employee(102, "Smith", 55000),
				new Employee(103, "Patrick", 150000),
				new Employee(104, "Maru", 95000)));
		
		filterempList = empList.stream().
		filter(p -> p.salary > 55000).
		map(f -> f.salary).
		collect(Collectors.toList());
		System.out.println(filterempList);
		
		empList.stream().
		filter(p -> p.salary > 55000).
		map(f -> f.salary).
		forEach(c -> System.out.println(c));
		
		
	}

}
