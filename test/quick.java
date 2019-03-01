package test;

public class quick {

	
	public static void main(String[] args) {
		
		int[] a = new int[]{4,2,6,1,8,0,5};
		int temp =0;
		int index = 0;
		int pivot = a.length-1;
		
		for(int i =0 ; i<a.length-1;i++) {
			
			if(a[i]<=a[pivot]) {
				
				temp = a[index];
				a[index]=a[i];
				a[i]=temp;
				
				
				index++;
			}
						
		}
	
		a[pivot]=a[pivot]^a[index];
		a[index]=a[pivot]^a[index];
		a[pivot]=a[pivot]^a[index];
		
		 
		for(int j : a) {
			System.out.println(j);
		}
		
		
		
		
		
	}
	
}
