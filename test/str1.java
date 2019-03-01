package test;

import java.util.Scanner;

public class str1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		String st = "anshul";
		char [] ch1 = st.toCharArray();
		
		for(int i=0;i<st.length();i++) {
			System.out.println(ch1[i]);
		}
		
		String t = st.replace('a', 'A');
		int count = 0;

		for (int i = 0; i <= s.length()- 1; i++) {

			if (s.charAt(i)=='a') {

				count++;

			}
			
		}

		System.out.println("no. of time a " + count);
		System.out.println(s.length());
		System.out.println(t);

	}
}
