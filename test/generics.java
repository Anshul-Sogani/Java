package test;
import java.util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class generics {
	
	public static void main(String a[]) {
		
		Collection values = new ArrayList();
		
		values.add(3);
		values.add(4);
		values.add("Asnhul");
		values.add("sogani");
		
		/*Iterator i = values.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());			
		}*/
		
		
		for(Object b : values ) {
			
			System.out.println(b);
			 	
		}
		
		
		
		
	}

}
