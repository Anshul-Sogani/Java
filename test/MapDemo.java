package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

public static void main(String a[]) {
	
	Map<String,String> values= new HashMap<>();
	
	values.put("name", "anshul");
	values.put("actor", "Hritik");
	values.put("hobbies", "coding");
	
	Set<String> keys = values.keySet();
	
	for(String s : keys) {
		
		System.out.println(s  + "  " + values.get(s));
		
	}
	
	
	
	
	
}




}
