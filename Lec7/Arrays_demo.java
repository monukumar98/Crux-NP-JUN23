package Lec7;

public class Arrays_demo {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(arr[2]);
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		int[] other = arr;
		System.out.println(other.length);
	}
}
