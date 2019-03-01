package test;

public class arrayremove {
	
	public static void main(String[] args) {
		int [] a = new int[] {1,2,2,3,4,5,5,5,6,7,8,9,9};
		
		int i = 0; 
		int count = 0 ;
		
		for (int j=1;j<a.length;j++) {
			
			if(a[j-1] == a[j]) {
				count++;
			}
			
			if(a[i]!=a[j]) {
				
				i++;
				a[i] = a[j];
				
			}
		}
		
		for(int k : a)
		System.out.println(k);
		
		System.out.println("value"+i);
		System.out.println("count"+count);
		
		
	}

}
