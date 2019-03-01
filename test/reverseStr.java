package test;
import java.util.Scanner;
public class reverseStr {
	
	public String toString() {
		return "asdnifon" ;
		
	}
	static void reverse (char arr[],int start,int end) {
		
		if(start >= end) {
			return;
		}
		char temp;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		reverse(arr,start+1,end-1);
		
	}


	public static void main(String[] args) {
		
		System.out.println("enter the string : ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
		int n =	s.length()-1;
		char [] ch = s.toCharArray();
		
		reverseStr.reverse(ch, 0, n);
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
	String f = new String (ch);
		
		System.out.println(f);
		
		
		
		
		
	}

}
