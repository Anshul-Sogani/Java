package test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String a[]) {
		
		Set<Integer> values = new HashSet<>();
		
		values.add(52);
		values.add(5);
		values.add(22);
		values.add(12);
		values.add(52);
		values.add(62);
		values.add(72);
		values.add(82);
		
		for(int i : values) {
			System.out.println(i);
		}
		
		
		
		
	}
	
	
	
}
