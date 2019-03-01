package test;



public class _setter {
	
	int age;
	
	
	public _setter(String name) {
	System.out.println("name chosen is " + name );	
	}
	
	public void setage(int age) {
		this.age = age; 
	}
	
	public void getage() {
		System.out.println("the age is " + age);
	}
	
	

	public static void main( String a[]) {
		
		_setter mypup = new _setter("champ");
		
		mypup.setage(2);
		mypup.getage();
		
		
		
		
	}

}
