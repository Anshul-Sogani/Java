package test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

	
public class arraylist {

	public static void main(String args[]) {
		
		List<Integer> arr = new ArrayList<Integer>();
		
		Random r = new Random();
		
		for(int i=0;i<100;i++) {
			
			arr.add(r.nextInt(120));
			
		}
		
		Collections.sort(arr);
		
		for(int i :arr) {
			System.out.println(i);
		}
		
		System.out.println("comparator");
		
		Comparator<Integer> com = new ComImp();
		
		Collections.sort(arr,com);
		
		for(int i : arr) {
			
			System.out.println(i);
		}
		
		
		
		
		
	}
	
}
