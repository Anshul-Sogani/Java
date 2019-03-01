package test;

public class pract {

	public static void main(String[] args) {
		
		String name = "anshul sogani";
		String lastname = "sogani";
		
		int index = name.indexOf(name);
		
		System.out.println(name.equals(lastname));
		System.out.println(name.lastIndexOf("a"));
		
		String replace = name.replace('a', 'b');
		
		System.out.println(replace);
		
		
		System.out.print(name.toUpperCase());
	
	}
	
}
