package Lec40;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };
		System.out.println(maximumprofit(wine, 0, wine.length - 1, 1));
	}

	public static int maximumprofit(int[] wine, int i, int j, int year) {
		if (i > j) {
			return 0;
		}

		int f = wine[i] * year + maximumprofit(wine, i + 1, j, year + 1);
		int s = wine[j] * year + maximumprofit(wine, i, j - 1, year + 1);
		return Math.max(f, s);

	}
}
