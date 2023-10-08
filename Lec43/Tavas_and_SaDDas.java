package Lec43;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(index(s));

	}

	public static int index(String s) {
		int ans = 0;
		int n = s.length();
		ans = (1 << n) - 2;
		int pos = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				ans = ans + (1 << pos);
			}
			pos++;
		}
		return ans + 1;

	}
}
