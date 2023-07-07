package Lec10;

public class K_th_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 128;
		System.out.println(answer(k, n));
		System.out.println(answer1(k, n));
	}

	public static int answer(int k, int n) {
		int x = 1;
		while (Math.pow(x, k) <= n) {
			x++;
		}
		return x - 1;
	}

	public static int answer1(int k, int n) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

}
