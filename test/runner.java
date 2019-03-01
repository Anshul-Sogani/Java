package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class runner {
	
	public static void main(String a[]) {
		
		List<laptop> lap = new ArrayList<>();
		
		lap.add(new laptop("hp","anshul",1800));
		lap.add(new laptop("asus","avani",1900));
		lap.add(new laptop("lenovo","ashish",1000));
		lap.add(new laptop("acer","anisha",1020));
		lap.add(new laptop("apple","oshin",1200));
	
		Comparator<laptop> com = new Comparator<laptop>() {
			public int compare(laptop l1 , laptop l2) {
				
				if(l1.getPrice()<l2.getPrice()) {
					return 1;
				}
				
				return -1;
				
				
			}
		};
		
		Collections.sort(lap,com);
		
		System.out.println(lap);
		
		
		
		
	}

}
