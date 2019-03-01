package test;

public class InnerClass {

	public static void main(String[] args) {

		Inner in = new Inner();
		
		in.show();

		Inner.Inside inside = in.new Inside();

		inside.show();

		Anon a = new Anon() {

			public void print() {

				System.out.print("Doing good");

			}
			
		};
		
		a.print();

	}

}

class Inner {

	int age;
	String name;
	public void show() {
		System.out.print("acbd");
	}

	class Inside {

		public void show() {

			System.out.println("hello");
		}
	}

}

class Anon {

	public void print() {
		System.out.println("hi how are you?");
	}

}