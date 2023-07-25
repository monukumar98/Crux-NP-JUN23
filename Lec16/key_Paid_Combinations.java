package Lec16;

import java.util.*;

public class key_Paid_Combinations {
	static String[] code = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "23";
		List<String> ll = new ArrayList<>();
		Combination(str, "", ll);
		System.out.println(ll);
	}

	public static void Combination(String ques, String ans, List<String> ll) {
		if (ques.length() == 0) {
//			System.out.print(ans + " ");
			ll.add(ans);
			return;
		}

		char ch = ques.charAt(0);// '2'
		int num = ch - '0';
		String press = code[num];// abc
		for (int i = 0; i < press.length(); i++) {
			Combination(ques.substring(1), ans + press.charAt(i), ll);
		}
	}

}
