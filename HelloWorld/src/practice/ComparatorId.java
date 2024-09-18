package practice;

import java.util.Comparator;

public class ComparatorId implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.sid - o2.sid;
	}

}
