package test;
import java.util.Scanner;

public class fact {
	
	int sum =1;
	
	int fact1(int a) {
		
		for(int i = 1 ; i<=a ; i++) {
			
			sum = sum * i;
			
		}
		return sum;
		
	}
	
	int fac(int a) {
		
		if(a == 0) {
			return 1;
		}else {
			
			return (fac(a-1) * a);
			
		}
		
		
		
	}

	
		public static void main(String[] args) {
			
			Sy stem.out.println("enter the number to find the factorial");
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			fact f = new fact();
			f.fact1(n);
			int factorial = f.fac(n);
			
			
			System.out.println(f.sum);
			System.out.println(factorial);
			
			
			
			
		}
	
}
