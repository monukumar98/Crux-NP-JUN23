package Lec44;

public class Maximum_Sub_Array_Sum_of_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 4, 5 };
		int k = 3;
		System.out.println(MaxSum(arr, k));

	}

	public static int MaxSum(int[] arr, int k) {
		// TODO Auto-generated method stub
		int sum = 0, ans = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// grow
			sum -= arr[i - k];// shrink
			ans = Math.max(ans, sum);// cal
		}
		return ans;
	}

}
