package test;

public class reverseArray {
	
	
	
	void reverse(int[] z) {
		
	int	end = z.length-1;
		
		
		for(int i =0;i<z.length/2;i++) {
			
			z[i] = z[i]^z[end];
			z[end]= z[i]^z[end];
			z[i]=z[i]^z[end];
			
			end--;
			
			
			
		}
		
		
	}

	public static void main(String[] args) {
		int[]  a = new int[] {1,2,3,4,5,6,7};
		
		reverseArray arr = new reverseArray();
		
		arr.reverse(a);
		
		for(int i : a) {
			System.out.println(i);
		}
		
	}
}
