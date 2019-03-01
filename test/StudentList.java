package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {

	public static void main(String a[]) {
		
	
		List<Student> stud = new ArrayList<>();
			 stud.add(new Student(1,35));
			 stud.add(new Student(2,95));
			 stud.add(new Student(3,56));
			 stud.add(new Student(4,75));
			 stud.add(new Student(5,75));
			 stud.add(new Student(6,85));
			 stud.add(new Student(7,85));
			 stud.add(new Student(8,95));
			 
			 
			 for (Student s : stud) {
				 
				 System.out.println(s);
				 	 
			 }
			 
		Comparator com = new ComImp();
			 
		Collections.sort(stud);
			 
		System.out.println("compare"); 
		
		for (Student s : stud) {
			 
			 System.out.println(s);
			 	 
		 }
		 
		
		
	
	}
	
}
