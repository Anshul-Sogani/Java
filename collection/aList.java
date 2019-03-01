package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class aList {
	
	public static void main(String[] args) {
		
		Collection  c = new ArrayList();
		
		c.add("anshul");
		c.add("Sogani");
		c.add(21);
		
		
	Iterator i =  c.iterator(); 
	
	while(i.hasNext()) {
		
		System.out.println(i.next());
		
	}
	
	for(Object f : c) {
		
		System.out.println();
		
	}
	
	
		
		
		
		
		
	}

}
