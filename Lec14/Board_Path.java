package Lec14;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		PrintPath(0, n, "");
		System.out.println();
		System.out.println(count);
	}

	static int count = 0;

	public static int CountPath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.print(ans + " ");

			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 3; dice++) {
			count += CountPath(curr + dice, end, ans + dice);
		}
		return count;
//		PrintPath(curr + 1, end, ans + 1);
//		PrintPath(curr + 2, end, ans + 2);
//		PrintPath(curr + 3, end, ans + 3);
	}

	public static void PrintPath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (curr > end) {
			return;
		}

		for (int dice = 1; dice <= 3; dice++) {
			PrintPath(curr + dice, end, ans + dice);
		}
//		PrintPath(curr + 1, end, ans + 1);
//		PrintPath(curr + 2, end, ans + 2);
//		PrintPath(curr + 3, end, ans + 3);
	}

}
