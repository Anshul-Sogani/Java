package test;

public class Const {
	
	int a;
	int b;
	static int c=9;
	
	
	
	class myclass{
		
		public void show()
		{
			System.out.println("this is inner class member class");
		}
	}
	
	
	public void add(int a,int b) {
		System.out.println(a+b);
		
		
	}
	

	
	public static void main(String z[]) {
		
		Const x = new Const();
		x.add(10, 20);
		 c = 120;
		System.out.println(c+230);
		Const.myclass obj = x.new myclass();
		obj.show();
		
		
		
	}

}
