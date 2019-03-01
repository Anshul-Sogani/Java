package test;

public class insertion {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 6, 4, 7, 2, 0, 9 };

		for (int i = 1; i < a.length; i++) {

			int key = a[i];

			int j = i - 1;
			
			while(j>=0 && key<a[j])
			{
				a[j+1]= a[j];
				
				j--;
			}
			
			a[j+1 ]=key;
		}
		
		for(int k : a) {
			System.out.println(k);
		}

	}

}
