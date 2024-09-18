package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student2{
	
	int sid;
	String sname;
	char grade;
	
	Student2(int sid, String sname, char grade){
		this.sid = sid;
		this.sname = sname;
		this.grade = grade;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public char getGrade() {
		return grade;
	}

//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
//
//	public void setGrade(char grade) {
//		this.grade = grade;
//	}	
	
}

public class FlatMap {

	public static void main(String[] args) {
		
		List<Student2> stuList1 = new ArrayList<>(List.of(
				new Student2(101, "John", 'A'),
				new Student2(102, "Sena", 'C'),
				new Student2(103, "Patrick", 'D'),
				new Student2(104, "Mark", 'B')));
		
		List<Student2> stuList2 = new ArrayList<>(List.of(
				new Student2(106, "Ashok", 'C'),
				new Student2(107, "Ram", 'A'),
				new Student2(108, "Sam", 'B'),
				new Student2(109, "Muren", 'A')));
		
		List<List<Student2>> finalList = new ArrayList<>(List.of(stuList1,stuList2));
		
		List<Student2> finalList1 = new ArrayList<>();
		
		for(List<Student2> s: finalList) {
			
			for(Student2 obj:s) {
				System.out.println("Id: " +obj.sid+ ", Name "+obj.sname+", Grade "+obj.grade);
			}
		}
		
		finalList1 = finalList.stream().flatMap(l -> l.stream()).filter(s -> s.grade =='A').
		collect(Collectors.toList());
		
		finalList.stream().flatMap(l -> l.stream()).filter(s -> s.grade =='A').
		map(s -> s.sname).count();
//		forEach(s -> System.out.println(s));
		
		
	}

}
