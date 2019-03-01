package innerclass;

public class inclass {

	int i =10;
	
	static class inner{
		
		int j =20;
	}
	
	public static void main(String[] args) {
		
		inclass obj = new inclass();
		/*inclass $ inner obj1 = obj.new inner();*/
		inclass.inner obj1 = new inclass.inner();
		
		System.out.println(obj1.j);	
		
	}
	
	
}
