package Lec43;

public class Magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(Number(n));
	}

	public static int Number(int n) {
		int mul = 5;
		int ans = 0;
		while (n > 0) {
			int rem = n % 2;

			ans = ans + rem * mul;
			mul = mul * 5;
			n = n / 2;

		}
		return ans;

	}

}
