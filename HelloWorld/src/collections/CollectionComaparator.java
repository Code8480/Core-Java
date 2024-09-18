package collections;

import java.util.Comparator;

public class CollectionComaparator implements Comparator<Student15> {

//	@Override
//	public int compare(Student15 o1, Student15 o2) {
//		return o1.getLastName().compareTo(o2.getLastName());
//		}
	
	/*
	 * @Override public int compare(Student15 o1, Student15 o2) { return
	 * o1.getFirstName().compareTo(o2.getFirstName()); }
	 */
	
	@Override
	public int compare(Student15 o1, Student15 o2) {
		if(o1.getRollNumber() > o2.getRollNumber()) {
			return 1;
		}else if(o1.getRollNumber() <  o2.getRollNumber()) {
			return -1;
		}else
			return 0;
		}
	
//	@Override
//	public int compare(Student15 o1, Student15 o2) {
//		if(o1.getAge() > o2.getAge()) {
//			return 1;
//		}else if(o1.getAge() <  o2.getAge()) {
//			return -1;
//		}else
//			return 0;
//		}
	
	

}
