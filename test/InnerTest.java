package test;

public class InnerTest {
	
	public static void main(String args[]) {
	
	a obj1 = new a();
	obj1.show();
	
	a.b obj2 =new a.b();
	
	obj2.show();
	
	c obj3 = new c() {
		
		public void display() {
			System.out.println("hello moto");
		}
		
		
	};
	
	obj3.display();
	
	c obj4 = ()-> {
		
		System.out.print("hellllllllo");
		
	};
	
	obj4.display();
	
	
	
	
	
	
	}
	
	

}

class a {

	public void show() {

		System.out.print("hello!");
	}
		static class b {

			public  void show() {

				System.out.print("hi!!!!");
			}

		}

}

@FunctionalInterface
interface c{
	
	public void display();
		
	}
