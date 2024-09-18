package LambdaExpressions;

import java.util.*;
import java.util.stream.Collectors;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;

class Student{
	
	int sid;
	String sname;
	char grade;
	
	Student(int sid, String sname, char grade){
		this.sid =sid;
		this.sname = sname;
		this.grade = grade;
	  }
	}

public class FlatMap2 {

	public static void main(String[] args) {
		
//		List<Employee> emp = Arrays.asList(
//				new Employee (101,"Alex",20000),
//				new Employee (102,"James",225000),
//				new Employee (103,"Scott",30000),
//				new Employee (104,"David",40000),
//				new Employee (105,"Neptor",100000),
//				new Employee (106,"Rymeros",120000));
		
		List<Student> stuList1 = new ArrayList<>(List.of(
				new Student (101,"Alex",'A'),
				new Student (102,"James",'C'),
				new Student (103,"Scott",'E'),
				new Student (104,"David",'F'),
				new Student (105,"Neptor",'A'),
				new Student (106,"Rymeros",'D')));
		
		List<Student> stuList2 = new ArrayList<>(List.of(
				new Student (101,"Ken",'A'),
				new Student (102,"Hong",'C'),
				new Student (103,"Ken",'D'),
				new Student (104,"Lim",'B'),
				new Student (105,"Henry",'A')));
		
		List<List<Student>> stuNewCollection = new ArrayList<>(List.of(stuList1, stuList2));
		
		List<String> updatedList = stuNewCollection.stream().
				flatMap(l -> l.stream()).
				map(l -> l.sname).
				collect(Collectors.toList());
		
		System.out.println(updatedList);
		
//		stuNewCollection.stream().
//			flatMap(l -> l.stream()).
//			map(l -> l.sname).
//			forEach(System.out.println(sname));
//		collect(Collectors.toList());
		
	
	}

}
