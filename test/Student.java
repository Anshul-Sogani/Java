package test;

public class Student implements Comparable<Student> {

	int rollno;
	int marks;
	
	Student(int rollno, int marks){
		
		this.rollno = rollno;
		this.marks = marks;
		
	}
	

	public String toString() {
		
		return "Student("+ "rollnumber " + rollno + "  marks "+ marks+')';
	}


	@Override
	public int compareTo(Student s) {
		if(this.marks>s.marks)
		{
			return 1;
		}
		
		return -1;
	}
	
	
	
}
