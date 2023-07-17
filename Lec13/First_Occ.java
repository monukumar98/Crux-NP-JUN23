package Lec13;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 1, 7, 8, 1, 6, 1, 78 };
		int item = 1;
		System.out.println(Occ(arr, item, 0));
	}

	public static int Occ(int[] arr, int item, int i) {
		if (arr.length == i) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}
		return Occ(arr, item, i + 1);
	}
}
