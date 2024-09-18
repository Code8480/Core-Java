package collections;

public class Student15 implements Comparable<Student15> {

	private int rollNumber;
	private String firstName;
	private String lastName;
	private int age;

	public Student15(int rollNumber, String firstName, String lastName, int age) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student15 o) {
		return this.firstName.compareTo(o.firstName);
				}

	@Override
	public String toString() {
		return "Student15 [rollNumber=" + rollNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
//	@Override
//	public int compareTo(Student15 o) {
//		if(this.rollNumber > o.rollNumber) {
//			return -1;
//		}else if(this.rollNumber < o.rollNumber) {
//			return 1;
//		}else
//			return 0;
//	}
	
//	@Override
//	public int compareTo(Student15 o) {
//		return this.lastName.compareTo(o.lastName);
//				}

	
	

}
