package test;

public class MapArray {

	public static void main(String[] args) {

		int a[] = new int[] { 1, 2, 3, 5, 6, 7, 8 };

		int t = 10;
		int start = 0;
		int end = a.length - 1;

		while (start < end) {

			if (a[start] + a[end] == t) {

				int[] b = {start, end};
				for (int i : b) {
					System.out.println(i);

				}

				break;

			}
			if (a[start] + a[end] < t) {

				start++;

			}

			if (a[start] + a[end] > t) {
				end--;
			}

		}
	}
}
