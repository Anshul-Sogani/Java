package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class camparator {
	public static void main(String[] args) {

	
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(21);
		l1.add(122); 
		l1.add(2);
		
		
		
		Comparator c = new comp();
		
		Collections.sort(l1, c);
		
		
		
		
		for(int i : l1) {
			System.out.println(i);
		}
		
		Iterator i  =  l1.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		

	
	}

}
