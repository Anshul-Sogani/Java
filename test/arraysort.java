package test;
import java.util.Scanner;

public class arraysort {
	
	int[] sort(int[] z){
		
		int i=z.length-1;
		for(int j= z.length-1;j>=0;j--) {
		
			while(z[i] == 0 && i>0) {
				i--;
			}
			
			while(z[j]!=0 && j>0) {
				j--;
			}
			
			if(i<j) {
				z[i]=z[i]^z[j];
				z[j]=z[i]^z[j];
				z[i]=z[i]^z[j];
				
			}
			 
			
			
		}
		
		
		return z;
		
	}
	
	
	int[] sort1(int[] z){
		
		int i=0;
		for(int j=0;j<z.length;j++) {
		while(z[i]!=0 && i<z.length) {
			
			i++;
			
		}
			
		while(z[j]==0 && j<z.length-1) {
			
			j++;
		}
		
		
		 if(j>i) {
			 
			 z[i]=z[i]^z[j];
			z[j]=z[i]^z[j];
				z[i]=z[i]^z[j];
				
		 }
			
		}
		
		return z;
		
	}
	
	public static void main(String args[]) {
		
		int[] a = new int[] {1,2,0,3,8,0,8,6,0,8,0,0,0,2,3,4,5,0,0,0,4,5,0,9,8,0,0};
		
		 arraysort  obj = new arraysort();
		 
		 int[] b= obj.sort1(a);
		 
		 for(int i : b) {
			 System.out.print(i);
		 }
		 
	}

}
