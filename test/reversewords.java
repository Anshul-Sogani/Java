package test;

import java.util.Scanner;

public class reversewords {

	public static void main(String a[]) {
		System.out.println("enter the string to get reverse");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String[] arr = s.split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);

			sb = sb.reverse();
			System.out.print(sb + " ");
			sb = sb.delete(0, sb.length());
		}

	}
}
