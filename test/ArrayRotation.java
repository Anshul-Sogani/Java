package test;

public class ArrayRotation {
	
	public static void main(String[] args) {
		
		
		int [] a = new int[] {1,2,3,4,5,6};
		
		int shift = 2;
		int j =0;
		
		
		
		for(int i = 0 ; i<a.length-shift ; i++) {
			if(i-shift>0) {
			a[i]= a[i]^a[i-2];
			a[i-2]= a[i]^a[i-2];
			a[i]= a[i]^a[i-2];
			}
			
			if(i-shift<0) {
				j=i+a.length-shift;
				a[i]= a[i]^a[j];
				a[j]= a[i]^a[j];
				a[i]= a[i]^a[j];
				
				}
			
		}
		
		for(int i : a) {
			System.out.println(i);
		}
		
		
		
	}

}
