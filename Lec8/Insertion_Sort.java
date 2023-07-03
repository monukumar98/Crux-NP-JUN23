package Lec8;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 12, 14, 5, 13 };
		int n = arr.length;
//		Insert_in_Sort(arr, arr[n - 1], n - 2);
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Insert_in_Sort(arr, arr[i], i - 1);
		}
	}
	public static void Insert_in_Sort(int[] arr, int item, int i) {

		while (i >= 0 && arr[i] > item) {
			arr[i + 1] = arr[i];
			i--;
		}
		arr[i + 1] = item;
	}

}
