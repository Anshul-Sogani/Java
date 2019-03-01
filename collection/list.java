package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class list {
	
	public static void main(String[] args) {
		
		Collection <Integer> l1 = new ArrayList<>();
		
		l1.add(21);
		l1.add(211);
		l1.add(12);
		
		Collections.sort(l1);
		
		Iterator i = l1.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
			
		}
	}

}
