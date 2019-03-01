package test;

import java.util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class lists {
	
	public static void main(String a[])
	{
	List<Integer> l = new ArrayList<Integer>();
	
	l.add(23);
	l.add(121);
	l.add(21);
	l.add(2);
	
	
	
	System.out.println("values are:");
	Collections.sort(l);
	
	l.forEach(System.out::println);
	
	
	}
}
