package test;


public class stringmethods {

	public static void main(String[] args) {
		
		String fname = "ans h ul";
		String lname = "iSogani";
		
		char ch = fname.charAt(3);
		String last= lname.toLowerCase();
		String first = fname.toUpperCase();
		int a = fname.length();
		String  n = fname.concat(lname);
		System.out.println(n);
		int indexofo = lname.indexOf("o"); 
		System.out.println(ch);
		int lst = lname.lastIndexOf("i");
		if (fname.equals(lname)) {
			System.out.println("anshul");
		}
		
		String fnamee=fname.replace("a", "aa");
		
		System.out.println(fnamee);
		
		int space = fname.indexOf(" ");
		
		System.out.println(space);
		
		int lspace = fname.lastIndexOf(" ");
		
		System.out.println(lspace);
		
		
		
		
		String f=fname.substring(lspace+1);
		
		System.out.println(f);
		
		
		
		
		
		
	}
	
}
