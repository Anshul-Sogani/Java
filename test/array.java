package test;
import java.util.*;

public class array {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter the size of the array");
		
		int n=sc.nextInt();
		int size = n;
		
		System.out.println("enter the elements of the array");
		
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
	
		for(int i = 0 ;i<n;i++) {
		arr.add(sc.nextInt());
		}
		
		
		int count = 0 ;
		
       for(int j = 0 ;j<arr.size();j++) {
			
			if(arr.get(j)== 0) {
				
				arr.remove(j);
				j--;
				count++;
				
			}
			
			
			
				
			}
       
       System.out.println(arr);
		
       
       for(int l = 0 ;l<count;l++) {
    	   
    	   arr.add(0,0);
       }
		
						
       System.out.println("output array");	
       System.out.println(arr);
       System.out.println(size);
		sc.close();
		}
			
		
	}
	
	

