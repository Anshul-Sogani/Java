package hashmap;

import java.util.HashMap;
import java.util.Map;

public class twosum {
	
	public static void main(String[] args) {
		
	int[] a = new int[] {1,2,3,4,5,6,7};
	int[] b = new int[2];
 	
	int target = 13;
	
	Map<Integer , Integer > map = new HashMap<>();
	
	for(int i= 0 ; i<a.length;i++ ) {
		
		if(map.containsKey(a[i])) {
			
			b[0]=a[i];
			b[1]=target - a[i]; 
					
		}else {
			
			map.put(target - a[i], i);
			
		}
		
	}
	
	
	
	System.out.println(b[0]);	
	System.out.println(b[1]);
}

}