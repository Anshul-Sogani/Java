package test;

import java.util.Scanner;

public class count_2 {
	
	static int n2(int n) {

	
		int count=0;
		
		while(n>0) {
			
			if ( n%10 ==2) {
				count++;
			}
			n= n/10;
					
			
			
		}
		
		return count;
	}
	
	static int range(int j) {
		
		int count =0;
		
		for(int i=1;i<=j;i++) {
			count=count+n2(i );
		}
		return count;
	}
	
	
	public static void main(String a[]) {
		
		System.out.println("enter the range");
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		count_2 obj = new count_2();
		
		int ab= range(t);
		
		System.out.println(ab);
		
	}
	
}
