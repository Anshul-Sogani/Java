package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c {
	
	public static void main(String[] args) {
		
		
		List <student>  l1 = new ArrayList<>();
		
		l1.add(new student(1,91));
		l1.add(new student(2,72));
		l1.add(new student (3,88));
		
		Collections.sort(l1, (s1,s2)->{
			return s1.marks<s2.marks?-1:0;
		}
				);
		
		
		for(student s : l1 ) {
			System.out.println(s);
		}
		
	}

}

 class student {

	int rollno;
	int marks;

	public student(int rollno, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		
	}

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	

}
