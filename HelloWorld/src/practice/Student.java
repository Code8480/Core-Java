package practice;

public class Student implements Comparable<Student>{
	
	int sid;
	String sname;
	int grade;
	public Student(int sid, String sname, int grade) {
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
	public int getGrade() {
		return grade;
	}
	
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.sname.compareTo(o.sname);
//	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.grade - o.grade;
	}
	
}
