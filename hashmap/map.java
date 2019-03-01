package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		
		
		Map <String , String > map = new HashMap<>();
		
		map.put("name", "anshul");
		map.put("lastname", "sogani");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			
			System.out.println(map.get(key));
			
		}
		
		
	}n
	
}
