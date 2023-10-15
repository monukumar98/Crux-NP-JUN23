package Lec45;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2 };
		int k = 10;
	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int si = 0, ei = 0;
		int p = 1;
		int ans = 0;
		while (ei < arr.length) {
			// grow
			p = p * arr[ei];

			// shrink
			while (p >= k && si <= ei) {
				p /= arr[si];
				si++;
			}

			// ans calculate
			ans += (ei - si + 1);

			ei++;
		}
		return ans;

	}
}
