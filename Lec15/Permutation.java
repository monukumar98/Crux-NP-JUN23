package Lec15;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		PrintPermutation(ques, "");

	}

	public static void PrintPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			String s1 = ques.substring(0, i);// ith char pehel
			String s2 = ques.substring(i + 1);// ith char ke baad
			PrintPermutation(s1 + s2, ans + ques.charAt(i));
		}

	}

}
