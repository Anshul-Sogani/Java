package test;

public class check {

	check() {
		System.out.println("class check");
	}

	public static void main(String[] args) {

		/*check ch = new check();*/

		check ch1 = new b();

		/*b b1 = new b();*/

	}
}

class b extends check {

	b() {
		System.out.println("this is class B");
	}
}
