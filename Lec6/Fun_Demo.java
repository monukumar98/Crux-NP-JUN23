package Lec6;

public class Fun_Demo {
	public static void main(String[] args) {
		System.out.println("hey");
		add();
		System.out.println("Bye");
	}
	public static void add() {
		int a = 7;
		int b = 9;
		int c = a + b;
		sub();
		System.out.println(c);
	}
	public static void sub() {
		int a = 7;
		int b = 9;
		int c = a - b;
		System.out.println(c);
	}

}
