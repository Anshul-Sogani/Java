package test;
import java.util.*;
public class count_number {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count =0;
		int num = sc.nextInt();
	
	int temp;
		
		for(int i =1; i<=num;i++) {
			 temp = 10;
		while(temp>9 ) {
			
			 temp=i%10;
			if(temp==2) {
				count++;
			}
			
		}
		
		}
		
		
		System.out.println(count);
		
		
	
		
	}

}
