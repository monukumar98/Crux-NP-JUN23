package Lec11;

public class Serach_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 4, 7, 11, 15 }, 
				         { 2, 5, 8, 12, 19 }, 
				         { 3, 6, 9, 16, 22 }, 
				         { 10, 13, 14, 17, 24 },
				         { 18, 21, 23, 26, 30 } };
		System.out.println(Serach(arr, 13));

	}

	public static boolean Serach(int[][] arr, int item) {
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {
			if (arr[row][col] == item) {
				return true;
			} else if (arr[row][col] > item) {
				col--;
			} else {
				row++;
			}
		}
		return false;

	}
}
