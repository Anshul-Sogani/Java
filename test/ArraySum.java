package test;
import java.util.Scanner;

public class ArraySum {
	
	
	public static void main(String[] args) {
	
		System.out.println("enter the sum ");
		Scanner sc = new Scanner(System.in);
		int[] a = new int[] {1,2,3,4,5,6};
		
		int output = sc.nextInt();
		
		ArraySum s = new ArraySum();
		System.out.println(s.sum(a,output));
		
		
		
	}
	
	boolean sum (int[] z,int output) {
		int s = 0;
		
		for(int i =0 ; i<z.length; i++) {
			
			for(int j = 0 ;j<z.length;j++) {
				
				s = z[i]+z[j];
				
				if(s==output) {
					return true;
				}
			}
			
		}
		
		
		
		return false;
		
	}

}
