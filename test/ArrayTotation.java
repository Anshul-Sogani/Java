package test;

public class ArrayTotation {

	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		int count = 0;
		int shift = 1;
		int start = arr.length -1;
		int temp = arr[start];
		int temp1 =0;
		while(count <= arr.length) {
			
			temp1 = arr[(start-shift)<0? arr.length-shift+start:start-shift];
			arr[(start-shift)<0? arr.length-shift+start:start-shift] = temp;
			temp = temp1;
			count++;
			if(start - shift < 0) {
				start+= arr.length - shift;
			}else {
				start-=shift;
			}
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
