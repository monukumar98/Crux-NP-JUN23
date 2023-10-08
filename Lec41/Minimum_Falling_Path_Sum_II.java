package Lec41;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -99999999;
			}
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, Minimum_Falling_Path(arr, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int Minimum_Falling_Path(int[][] arr, int cr, int cc, int[][] dp) {
		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		if (dp[cr][cc] != -99999999) {
			return dp[cr][cc];
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			if (i != cc) {
				ans = Math.min(ans, Minimum_Falling_Path(arr, cr + 1, i, dp));
			}
		}
		return dp[cr][cc] = ans + arr[cr][cc];

	}
}
