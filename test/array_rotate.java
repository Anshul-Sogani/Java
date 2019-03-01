package test;

public class array_rotate {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		int shift = 0x`;

		int[] temp = new int[a.length];

		for (int i = 0; i < a.length - shift; i++) {

			temp[i] = a[i+shift];

		}
		for (int i = 0; i < temp.length; i++) {

			System.out.println(temp[i]);
		}
		
		
		
		int index = 0 ;
		
		for (int j = a.length-shift;j<a.length;j++ )
		{
			temp[j]=a[index];
			index++;
		}
		
		for (int i = 0; i < temp.length; i++) {

			System.out.println(temp[i]);
		}
		
		
		
		

	}
}