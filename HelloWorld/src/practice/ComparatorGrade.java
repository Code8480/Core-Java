package practice;

import java.util.Comparator;

public class ComparatorGrade implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.grade - o2.grade;
	}

}
