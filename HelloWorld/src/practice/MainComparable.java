package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {

	public static void main(String[] args) {
		
		List<Student> slist = new ArrayList<>();
		slist.add(new Student(101,"John",100));
		slist.add(new Student(102,"Kim",95));
		slist.add(new Student(103,"Rustin",90));
		slist.add(new Student(104,"Rambo",91));
		slist.add(new Student(105,"Tohhnie",75));
		
//		Collections.sort(slist, new ComparatorGrade());
//		for(Student s:slist) {
//		    System.out.println(s);
//			System.out.println(s.sname+" "+s.sid+ " "+s.grade);
			
//			Collections.sort(slist, new ComparatorName());
//			for(Student s:slist) {
////				System.out.println(s);
//				System.out.println(s.sname+" "+s.sid+ " "+s.grade);
				
//				Collections.sort(slist, new ComparatorId());
//				for(Student s:slist) {
////					System.out.println(s);
//					System.out.println(s.sname+" "+s.sid+ " "+s.grade);
		
		Collections.reverseOrder(new ComparatorGrade());
		for(Student s:slist) {
//		System.out.println(s);
		System.out.println(s.sname+" "+s.sid+ " "+s.grade);
			
		}
		
	}

}
