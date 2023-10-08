package Lec41;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -99999999;
			}
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, Minimum_Falling(arr, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int Minimum_Falling(int[][] arr, int cr, int cc, int[][] dp) {
		if (cr >= arr.length || cc >= arr[0].length || cc < 0) {
			return Integer.MAX_VALUE;
		}
		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		if (dp[cr][cc] != -99999999) {
			return dp[cr][cc];
		}

		int left = Minimum_Falling(arr, cr + 1, cc - 1, dp);
		int right = Minimum_Falling(arr, cr + 1, cc + 1, dp);
		int down = Minimum_Falling(arr, cr + 1, cc, dp);
		return dp[cr][cc] = Math.min(right, Math.min(left, down)) + arr[cr][cc];

	}

}
