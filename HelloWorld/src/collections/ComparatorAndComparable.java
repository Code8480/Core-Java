package collections;

class Student implements Comparable<Student>{
	
	private String name;
	private int id;
	
	Student(String name, int id){
		
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
public class ComparatorAndComparable {

	public static void main(String[] args) {
		
		

	}

}
