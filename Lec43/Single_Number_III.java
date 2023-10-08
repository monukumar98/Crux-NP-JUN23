package Lec43;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 2, 5 };
	}

	public static int[] singleNumber(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans = ans ^ nums[i];
		}
		int mask = ans & (~(ans & (ans - 1)));
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & mask) != 0) {
				a ^= nums[i];
			}
		}
		int b = ans ^ a;
		int[] arr = { a, b };
		return arr;

	}
}
