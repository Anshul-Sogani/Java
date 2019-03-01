package ex;

import java.util.Scanner;

public class e1 {

	void add(int a, int b) {

		System.out.println(a + b);

	}

	void sub(int a, int b) {

		System.out.println(a - b);

	}

	void devide(int a, int b) {

		try {

			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("cant devie by 0 " + e);
		} finally {
			System.out.println("bye");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("select what you want to do");
		System.out.println("press 1 for add");
		System.out.println("press 2 for sub");
		System.out.println("press 3 for devide");
		System.out.println("press 0 to exit");

		int x, y;
		int a = sc.nextInt();
		
		if(a>3) try{
			throw new myex("Please select from the given options  "); 
				
			}catch(Exception e) {
				System.out.println(e);
			}
		

		e1 ex = new e1();

		while (a != 0) {

			switch (a) {

			case 1:
				System.out.println("enter the two numbers you want to add");
				x = sc.nextInt();
				y = sc.nextInt();

				ex.add(x, y);
				System.out.println("Selection : ");
				a = sc.nextInt();

			case 2:
				System.out.println("enter the number you want to subtract");
				x = sc.nextInt();
				y = sc.nextInt();

				ex.sub(x, y);
				System.out.println("Selection : ");
				a = sc.nextInt();
			case 3:
				System.out.println("enter the number you want to devide");
				x = sc.nextInt();
				y = sc.nextInt();

				ex.devide(x, y);
				System.out.println("Selection : ");
				a = sc.nextInt();

			}
		}
	}

}
