package test;

import java.util.Scanner;

public class arraytest {
	
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		student11 [] stu  = new student11[5];
		
		stu[0] = new student11(21,"anshul","java");
		stu[1] = new student11(22,"anisha","php");
		stu[2] = new student11(23,"ashish","python");
		stu[3] = new student11(24,"avani","c++");
		stu[4] = new student11(25,"oshin","javascript");
		
		
		for(int i = 0 ; i<stu.length;i++) {
			
			System.out.println(stu[i].age);		
		
			
		}
		
				
		
		
	}
	
	
}




class student11{
	int age;
	String name;
	String subject;
	
	student11(int age , String name , String subject){
		this.age = age;
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "student11 [age=" + age + ", name=" + name + ", subject=" + subject + "]";
	}
	
}