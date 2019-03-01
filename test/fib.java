package test;
import java.util.Scanner;

public class fib {
	
	int fibb(int a) {
		
		if(a<3 && a>0) {
			return 1;
		}
		return fibb(a-1)+fibb(a-2);
		
	}
	void fibb1(int a) {
		
		int temp= 0;
		
		int i=1;
		int j=1;
		if(a==1) {
			System.out.println(i);
		}
		if(a>=2) {
			System.out.println(i);
			System.out.println(j);
		
		
				for(int k=0;k<a-2;k++) {
					
					temp = i+j;
					i = j ;
					j = temp;
					
					System.out.println(j);
						
					
				}
		
		}
		
	}	
		
		
	
	
	public static void main(String[] args) {
		
		System.out.println("enter the number to find the fib");
		
		Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();
		
		fib f1 = new fib();
		sc.close();
		//for(int i =1 ; i<=n;i++) {
		//int sum = f1.fibb(i);
		//System.out.println(sum);
		
		f1.fibb1(n);
		//}
		
		
	
		
		
		
	}

}
