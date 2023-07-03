package Lec8;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 4, 1, 2 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			int mini = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
	}
}
