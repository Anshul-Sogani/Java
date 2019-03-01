package test;

public class for_test {
	
	public static void main(String[] args) {
		
		String [] str = new String[]{"asnhul","awesome","abcd"};		
	
		String s = "anshul"; 
		
		char[] ch = new char[s.length()];
		
		ch = s.toCharArray();
		
		
		
		
	for(int i =0 ; i<ch.length; i++  )
		
	{
			
		for(int j=1;j<str.length;j++) {
			
			String compare= str[j];
			
			if (ch[i]==compare.charAt(i) ) {
				
				System.out.println(ch[i]);
				
			}else break;
			
		}
	}
}
}