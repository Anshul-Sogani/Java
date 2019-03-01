package test;

import java.util.Scanner;

public class RecursiveArray {
	
	int[] array(int n) {
		
		int[] a = new int [n];
		
		if(n==0) {
			a[0]=0;
			return a;
		}
		if(n==1) {
			a[0]=0;
			a[1]=1;
			return a;
		}
		
		a[0]= 0;
		a[1] = 1;
		
		 return sum(a , 2 , n );
		 
		 
	}
	
	int [] sum(int a [] , int i,int n) {
		
		if(i<=n) {
			
			a[i]= a[i-1]+a[i-2];
			
			i++;
			
			}
		
		if(i>n) {
			return a;
		}
		
		return a;
	
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		RecursiveArray arr= new RecursiveArray();
		
		
		int[] a = arr.array(i); 
		
		for(int j:a) {
		System.out.println(j);
		}
		
		
		
		
		
		
	}

}
