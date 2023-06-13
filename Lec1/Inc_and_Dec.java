package Lec1;

public class Inc_and_Dec {
	public static void main(String[] args) {
		int a = 6;
		System.out.println(a++);
		System.out.println(a);
		// int x = a + a-- + 7 + a++ + 5 - a--;
		int x = 8 + a-- + a++ + a++ + a-- - a++;
		System.out.println(x);
		int b = 9;
		System.out.println(++b);
		System.out.println(b);

	}
}
