package Lec6;

public class Fun_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		System.out.println(add());
		System.out.println("Bye");
	}
	public static int add() {
		int a = 7;
		int b = sub();
		int c = a - b;
		return c;
	}
	public static int sub() {
		int a = 7;
		int b = 9;
		int c = a - b;
		
		return c;
	}
}
