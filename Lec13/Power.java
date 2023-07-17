package Lec13;

public class Power {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 3;
		System.out.println(pow(a, b));
	}
	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if (b == 0) {
			return 1;
		}
		int fn = pow(a, b - 1);
		return a * fn;
	}
}
