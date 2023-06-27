package Lec6;

public class Fun_Demo_3 {
	static int val = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 7;
		int b = 11;
		System.out.println(val);
		System.out.println(add(6, b));
		System.out.println(val);
		System.out.println("Bye");
	}
	public static int add(int a, int b) {
		int c = a + b;
		int val = 7;
		Fun_Demo_3.val = Fun_Demo_3.val + 5;
		System.out.println(val);
		// System.out.println(sub(a, c));
		return c;
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
