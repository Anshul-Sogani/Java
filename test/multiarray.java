package test;

import java.util.Scanner;

public class multiarray {

	public static void main(String[] args) {

		int[][] a = new int[3][3];
		int [] arr = {1,2,3};
		int [] copy = arr.clone();
		
		for(int i : copy) {
			System.out.println(ix);
		}
		
		

			System.out.println(a.getClass());
		
		Scanner sc = new Scanner(System.in);

		System.out.println("entee the values of the 2d array!");

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				a[i][j] = sc.nextInt();

			}

		}

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(a[i][j]);
				
				
			}
			
			System.out.println();
		}

	}

}
